package com.czxy.day02.trait_demo

/*
 * @Auther: 传智新星
 * @Date: 2020/1/26 16:08
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _10TraitDemo {

  // 1. 创建实现类
  class MyUtils {
    def printMsg(msg: String) = println(msg)
  }

  // 2. 创建trait，从类中继承
  trait Logger extends MyUtils{
    def log (msg:String) = println(msg)
  }

  // 3. 创建一个实现类，继承trait
  class Person(var name:String = "") extends Logger{

    def sayHello() = log(name + "你好！")
  }

  // 4. 创建实现类的对象，调用方法测试
  def main(args: Array[String]): Unit = {

    val person = new Person("张三")
    person.sayHello()

  }

}
