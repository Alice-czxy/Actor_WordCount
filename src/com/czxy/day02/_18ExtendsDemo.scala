package com.czxy.day02

/*
 * @Auther: 传智新星
 * @Date: 2020/1/21 15:25
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _18ExtendsDemo {

  // 1. 创建一个Person类,定义成员变量 / 方法
  class Person {

    var name:String = _

    def getName() = this.name

  }

  // 2. 创建Student单例对象,从Person类继承
  object Student extends Person


  // 3. 设置、访问单例对象中的成员
  def main(args: Array[String]): Unit = {

    Student.name  = "张三"
    println(Student.getName())

  }
}
