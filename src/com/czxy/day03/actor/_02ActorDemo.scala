package com.czxy.day03.actor
import scala.actors.Actor
/*
 * @Auther: 传智新星
 * @Date: 2020/1/31 15:14
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _02ActorDemo {
  // 1. 创建两个Actor,使用object继承Actor来实现
  object Actor1 extends Actor{
    override def act(): Unit = {
      (1 to 10).foreach(println(_))

    }
  }

  object Actor2 extends Actor{
    override def act(): Unit = {
      (11 to 20).foreach(println(_))

    }
  }


  // 2. 启动Actor
  def main(args: Array[String]): Unit = {
    Actor1.start()
    Actor2.start()


  }

}
