package com.czxy.day03.matchDemo

/*
 * @Auther: 传智新星
 * @Date: 2020/1/29 10:41
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _07MatchDemo {

  def main(args: Array[String]): Unit = {
    // 1. 创建两个元组用于模式匹配
    val tuple1 = (1,3,4)
    val tuple2 = (3,4,5)

    // 2. 使用match...case 来进行匹配
    tuple2 match {

      case (1,x,y) => println(s"匹配三个元素且第一个元素为1的元组")
      case (x,y,5) => println(s"匹配三个元素且第一个元素为5的元组")
      case _ =>

    }
  }
}
