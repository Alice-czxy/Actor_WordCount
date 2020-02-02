package com.czxy.day02.trait_demo

/*
 * @Auther: 传智新星
 * @Date: 2020/1/23 18:43
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _03TraitDemo {

  // 1. 创建特质，定义抽象方法
  trait Logger {

    def log(msg:String)

  }

  // 2. 定义单例对象，实现特质
  object CosoleLogger extends Logger{

    override def log(msg: String): Unit = println("控制台消息:"+msg)

  }

  // 3.  调用单例对象的实现方法
  def main(args: Array[String]): Unit = {

    CosoleLogger.log("你是一个好人!")

  }

}
