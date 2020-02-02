package com.czxy.day02

/*
 * @Auther: 传智新星
 * @Date: 2020/1/21 15:14
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _17ExtendsDemo {

  // 1.一个Person类，定义成员变量 / 方法
  class Person{

    var name:String = _

    def getName() = this.name

  }

  // 2. 创建Student类对象, 访问成员
  class Student extends Person

  // 3. 创建Student类对象，访问成员
  def main(args: Array[String]): Unit = {

    val student = new Student
    student.name = "张三"

    println(student.getName())

  }


}

