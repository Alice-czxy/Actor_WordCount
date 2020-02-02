package com.czxy.day02

/*
 * @Auther: 传智新星
 * @Date: 2020/1/23 15:26
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _24AnonymouseDemo {

  // 1. 创建抽象类
  abstract class Person{

    // 定义抽象方法
    def sayHeello()

  }

  //  2. 直接使用匿名内部类来创建对象
  def main(args: Array[String]): Unit = {

    var example = new Person {
      override def sayHeello(): Unit = println("Hello!")

    }

    //  调用方法
    example.sayHeello

  }
}
