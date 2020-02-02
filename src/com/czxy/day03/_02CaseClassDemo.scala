package com.czxy.day03

/*
 * @Auther: 传智新星
 * @Date: 2020/1/27 09:54
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _02CaseClassDemo {

  // 1.创建样例类，添加可变的成员
  case class Person(var name:String , var age:Int)

  // 2. 创建对象，修改年龄字段
  def main(args: Array[String]): Unit = {

    val zhangsan = Person("张三",20)

    zhangsan.age = 30

    println(zhangsan)
  }
}
