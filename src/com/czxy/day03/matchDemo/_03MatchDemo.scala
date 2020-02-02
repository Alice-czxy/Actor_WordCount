package com.czxy.day03.matchDemo

import scala.io.StdIn

/*
 * @Auther: 传智新星
 * @Date: 2020/1/29 09:42
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _03MatchDemo {

  def main(args: Array[String]): Unit = {

    // 1 .从控制台读取一个数字
    val input = StdIn.readInt()

    // 2. 使用模式匹配指定范围的数据，打印输出
    input match {
      case x if x >= 0 && x <= 3 => println("[0-3]")
      case x if x >= 4 && x <= 8 => println("[4-8]")
      case _ => println("未匹配")
    }


  }
}
