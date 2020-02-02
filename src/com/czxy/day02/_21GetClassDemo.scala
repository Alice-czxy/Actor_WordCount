package com.czxy.day02

/*
 * @Auther: 传智新星
 * @Date: 2020/1/21 22:54
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _21GetClassDemo {
  // 1. 创建类和对象
  class Person

  class Student extends Person

  // 2. 创建对象,判断对象的类型(isInstance/getClass)
  def main(args: Array[String]): Unit = {

    // 指定子类对象为其父类对象
    val student:Person = new Student

    if(student.isInstanceOf[Person]){

      println("isInstance:student是Person类型")
    }else{

      println("isInstance:student不是Person类型")
    }

    println("_"*10)

    // 使用 getClass 获取对象的类型
    // 使用classOf 获取类的类型
    if (student.getClass  == classOf[Person]){

      println("getClass/classOf: student是Person类型")

    }else{

      println("getClass/classOf: sutdent不是Person类型")

    }


    if (student.getClass  == classOf[Student]){

      println("getClass/classOf: student是Student类型")

    }else{

      println("getClass/classOf: student不是Student类型")

    }

  }

}
