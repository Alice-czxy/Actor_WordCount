package com.czxy.day03.wordcount


import scala.actors.Actor
import scala.io.Source

/*
 * @Auther: 传智新星
 * @Date: 2020/1/31 22:16
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
class WordCountActor extends Actor{
  override def act(): Unit = {

    loop{

      react{

        case WordCountTask(fileName) =>{

          println("接收到任务:对"+fileName+"进行单词统计")

          // 1.读取文件，转换为列表
          val lineList = Source.fromFile(fileName).getLines().toList
          //println("lines:"+lineList)
          // List(hadoop sqoop hadoop, hadoop hadoop flume, hadoop hadoop hadoop, spark)

          // 2.切割字符串，转换成一个一个的单词
          // [hadoop,sqoop,hadoop]
          val wordList: List[String] = lineList.flatMap(_.split(" "))

          // 3.将单词转换成一个元组
          // [<hadoop,1>,<sqoop,1>,<hadoop,1>]
          val wordAndCountList : List[(String, Int)] = wordList.map(_ -> 1)

          // 4. 调用工具类方法来对单词元组列表进行分组、聚合
          val wordCountMap: Map[String, Int] = WordCountUtil.reduce(wordAndCountList)

          // 5. 打印测试
          //println(wordCountMap)

          // 6. 将统计数据封装到一个样例类中，发送给MainActor
          sender ! WordCountResult(wordCountMap)

        }
      }
    }

  }
}
