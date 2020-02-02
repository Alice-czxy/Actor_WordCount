package com.czxy.day03.matchDemo

import scala.io.StdIn

/*
 * @Auther: 传智新星
 * @Date: 2020/1/29 08:53
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
//单词	返回
//hadoop	大数据分布式存储和计算框架
//zookeeper	大数据分布式协调服务框架
//spark	大数据分布式内存计算框架
//未匹配	未匹配

object _01MatchDemo {

  def main(args: Array[String]): Unit = {

    // 1. 从控制台读取输入单词
    val input = StdIn.readLine()

    // 2. 使用模式匹配单词是否能够匹配，如果匹配输出一句话
    val result = input match {
      case "hadoop" => "大数据分布式存储和计算框架"
      case "zookeeper" => "大数据分布式存协调服务框架"
      case "spark" => "数据分布式内存计算框架"
      case _ => "未匹配"
    }


    // 输出匹配结果
    println(result)



  }

}
