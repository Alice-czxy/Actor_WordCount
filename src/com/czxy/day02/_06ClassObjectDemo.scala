package com.czxy.day02

/*
 * @Auther: 传智新星
 * @Date: 2020/1/20 16:35
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _06ClassObjectDemo {

  // 1. 创建一个 Person 类对象，定义字段，成员方法
  class Person {

    // 定义成员变量也可以类似于定义变量一样
    // 使用类型推断来定义

    private var name = ""
    private var age = 0

    def getName()= this.name
    def setName(name:String) = this.name = name
    def getAge() = this.age
    def setAge(age:Int) = this.age = age

    // 获取姓名和年龄,返回的是一个元组
    private def getNameAndAge() = (this.name,this.age)

  }

  def main(args: Array[String]): Unit = {
    // 2. 创建一个Person 对象,测试访问成员变量/成员方法
    val person = new Person

    person.setName("张三")
    person.setAge(13)

    println(person.getName())
    println(person.getAge())


  }
}
