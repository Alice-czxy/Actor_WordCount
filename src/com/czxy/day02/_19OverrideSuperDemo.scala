package com.czxy.day02

/*
 * @Auther: 传智新星
 * @Date: 2020/1/21 21:00
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _19OverrideSuperDemo {

  // 1. 创建Person 父类，定义成员字段，成员方法
  class Person {

    val name:String = ""

    def getName() = this.name

  }

  // 2.  创建Student子类，重写成员/重写方法
  class Student extends Person {

    //重写字段【使用override来重写一个val字段】
    override val name: String = "Student"

    // 重写方法【使用super关键字来访问父类的成员方法】
    override def getName(): String = "hello,"+super.getName()

  }

  // 3.  创建子类对象，访问重写的成员

  def main(args: Array[String]): Unit = {

    val student = new Student

    println(student.name)
    println(student.getName())


  }

}
