package com.czxy.day02

/*
 * @Auther: 传智新星
 * @Date: 2020/1/20 16:13
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _3ClassObjectDemo {

  // 1. 定义类
  class Person{

    // 2. 定义成员变量
    var name:String = ""
    var age : Int = 0
  }

  def main(args: Array[String]): Unit = {

    // 3.创建对象,访问成员、设置成员变量的值
    val person = new Person

    person.name = "张三"
    person.age = 20

    println(person.name)
    println(person.age)

  }
}
