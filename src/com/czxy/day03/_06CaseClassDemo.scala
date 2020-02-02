package com.czxy.day03

/*
 * @Auther: 传智新星
 * @Date: 2020/1/27 13:43
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _06CaseClassDemo {

  // 1. 创建一个Sex枚举(样例对象)
  trait Sex
  // 创建两个样例对象，从特质继承
  case object Male extends Sex
  case object Female extends Sex

  // 2. 定义一个样例类，使用Sex枚举
  case class Person(name:String,sex:Sex)

  // 3. 创建样例类的对象
  def main(args: Array[String]): Unit = {

    val zhangsan = Person("张三",Male)
    val lisi = Person("李四",Female)

    println(zhangsan)
    println(lisi)
  }
}
