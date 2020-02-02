package com.czxy.day03

/*
 * @Auther: 传智新星
 * @Date: 2020/1/27 10:13
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _05CaseClassDemo {

  // 1. 创建样例类
  case class Person(name:String,age:Int)

  // 2  创建样例类对象,使用copy方法来创建一个新的对象
  def main(args: Array[String]): Unit = {
    var lisi = Person("李四",21)
    var wangwu = lisi.copy(name = "王五")

    println(wangwu)
  }
}
