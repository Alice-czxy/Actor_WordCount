package com.czxy.day03.actor

import scala.actors.Actor

/*
 * @Auther: 传智新星
 * @Date: 2020/1/31 15:07
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
//创建两个Actor，一个Actor打印1-10，另一个Actor打印11-20
//
//使用class继承Actor创建（如果需要在程序中创建多个相同的Actor）
//使用object继承Actor创建（如果在程序中只创建一个Actor）

object _01ActorDemo {
  // 1. 创建两个Actor,使用class继承的方式来创建
  class Actor1 extends Actor {

    override def act(): Unit = {
      // 编写业务代码
      // 一个Actor打印1-10
      (1 to 10).foreach(println(_))

    }

  }


  class Actor2 extends Actor{
    override def act(): Unit = {
      // 另一个Actor打印11-20
      (11 to 20).foreach(println(_))

    }
  }

  // 2. 新建Actor的对象，启动Actor
  def main(args: Array[String]): Unit = {

    // 并行执行
    new Actor1().start()
    new Actor2().start()


  }

}
