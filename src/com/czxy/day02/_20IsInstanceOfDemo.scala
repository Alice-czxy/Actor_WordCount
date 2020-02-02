package com.czxy.day02

/*
 * @Auther: 传智新星
 * @Date: 2020/1/21 22:42
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _20IsInstanceOfDemo {

  // 1. 创建Person类
  class Person

  // 2. 创建 Student 子类，从Person类继承
  class Student extends Person


  // 3. 创建对象，判断类型
  def main(args: Array[String]): Unit = {

    val student = new Student

    // 判断是不是student类型的
    if (student.isInstanceOf[Student]){

      // 是Student 类型,就进行一个转化
      val student1 = student.asInstanceOf[Student]

      println(student1)

    }else{

      // 不是Student类型
      println("不是Student类型!")
    }
  }

}
