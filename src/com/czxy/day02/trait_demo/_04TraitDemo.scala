package com.czxy.day02.trait_demo

/*
 * @Auther: 传智新星
 * @Date: 2020/1/24 09:29
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _04TraitDemo {

  // 1. 定义一个特质，定义具体的实现方法
  trait Logger {

    def log(msg:String) = println(msg)

  }

  // 2. 定义一个类，继承特质
  class UserService extends Logger{

    def add() = log("添加用户")

  }

  // 3. 创建实现类对象，调用方法
  def main(args: Array[String]): Unit = {

    val service = new UserService

    service.add()

  }

}
