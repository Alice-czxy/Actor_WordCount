package com.czxy.day02.trait_demo

/*
 * @Auther: 传智新星
 * @Date: 2020/1/26 10:33
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _07TraitDemo {

  // 1. 创建一个带有实现方法的特质
  trait Logger {

    def log(msg:String) = println(msg)

  }
  // 2. 创建一个没有任何方法的类
  class UserService

  // 3. 创建一个类的对象,使用混入方式将特质的具体方法添加到对象中
  def main(args: Array[String]): Unit = {

    val service1 = new UserService with Logger

    service1.log("你是一个好人!")

    // 没有混入trait的对象，就不具备有具体trait中定义的行为
    // val service2 = new UserService

  }
}
