package com.czxy.day02

/*
 * @Auther: 传智新星
 * @Date: 2020/1/23 13:15
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _23AbstractDemo {

  // 1.  创建带有抽象字段的抽象类
  abstract class Person{

    // 抽象字段,是不需要进行初始化
    val WHO_AM_I:String
  }

  // 2.  创建两个实现类实现抽象字段
  class Student extends Person {

    override val WHO_AM_I: String = "Student"

  }

  class Policeman extends Person {

    override val WHO_AM_I: String = "Policaman"

  }

  //  3. 创建这两个实现类的对象实例，打印字段
  def main(args: Array[String]): Unit = {

    val student = new Student
    val policeman = new Policeman

    println(student.WHO_AM_I)
    println(policeman.WHO_AM_I)

  }
}