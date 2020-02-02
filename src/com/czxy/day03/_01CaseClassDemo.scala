package com.czxy.day03

/*
 * @Auther: 传智新星123
 * @Date: 2020/1/27 09:50
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _01CaseClassDemo {

  // 1. 定义样例类，定义成员变量
  case class Person(name:String , age:Int)

  // 2. 创建样例类的对象
  def main(args: Array[String]): Unit = {

    val zhangsan = Person("张三",20)

    // 样例类中默认为val
    // zhangsan.age = 23
    println(zhangsan)

  }
}
