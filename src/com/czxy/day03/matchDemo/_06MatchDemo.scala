package com.czxy.day03.matchDemo

/*
 * @Auther: 传智新星
 * @Date: 2020/1/29 10:34
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _06MatchDemo {

  def main(args: Array[String]): Unit = {
    // 1. 创建三个不同的List
    var list1 = List(0)
    var list2 = List(0, 1, 2, 3, 4, 5, 6)
    var list3 = List(10, 11)

    // 2. 使用match..case来进行模式匹配
    // Nil 表示空列表,tali表示任意
    // 用 List(x,y) 类似的匹配也可以
    list3 match {

      case 0  :: Nil => println("只有一个元素且元素为0的列表")
      case 0  :: tail => println("第一个元素为0且数量不固定的列表")
      case x :: y :: Nil=> println(s"列表只有两个元素:${x},${y}")

    }
  }
}
