package com.czxy.day03.wordcount

import java.io.File

import scala.actors.Future

/*
 * @Auther: 传智新星
 * @Date: 2020/1/31 22:08
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object MainActor {
  def main(args: Array[String]): Unit = {
    // 加载指定目录的数据文件
    val DIR_PATH = "./data/"

    // 获取到指定目录下的所有数据文件名
    val fileNameList = new File(DIR_PATH).list().toList

    // 2.将数据文件添加上一个目录
    var fileDirNameList = fileNameList.map(DIR_PATH + _)

    // 3.打印所有的文件名
    println(fileDirNameList)

    // 2.0创建Actor关联文件
    // 2.1 创建Actor
    val wordCountActorList = fileNameList.map {

      fileName => new WordCountActor

    }

    // 2.2 将Actor和文件名关联在一起【拉链】
    val actorFileNameList : List[(WordCountActor,String)] = wordCountActorList.zip(fileDirNameList)


    //println(actorFileNameList)

    // 3. 启动Actor / 发送/接收消息
    var futureList = actorFileNameList.map {

      actorFileName =>
        val actor = actorFileName._1
        // 启动Actor
        actor.start()
        // 发送消息到Actor中，发送异步有会返回值消息
        val future: Future[Any] = actor !! WordCountTask(actorFileName._2)

        future
    }

    // 4. 编写一个While循环，等待所有的Actor都已经返回数据
    // future 未设置值的个数未达到0个就一直等待,达到就退出
    while (futureList.filter(!_.isSet).size!=0){ }

    // 获取Future中封装的数据
    // 通过apply获取数据
    // 此处返回多个future，应当map批量处理
    val WordCountResultList = futureList.map(_.apply().asInstanceOf[WordCountResult])

    // 获取样例类中封装的单词统计结果
    // List(Map(spark -> 1, hadoop -> 7, sqoop -> 1, flume -> 1))
    val wordCountResultMap = WordCountResultList.map(_.wordCountMap)

    // List[hadoop->3, spark->1, hadoop->2, flink->1]
    // 合并结果【把多个文件汇总的结果合并】
    val resultList = WordCountUtil.reduce(wordCountResultMap.flatten)

    println("-----------------------")
    println(resultList)


  }

}
