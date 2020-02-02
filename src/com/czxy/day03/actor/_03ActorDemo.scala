package com.czxy.day03.actor

import scala.actors.Actor

/*
 * @Auther: 传智新星
 * @Date: 2020/1/31 15:30
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
//创建两个Actor（ActorSender、ActorReceiver）
//ActorSender发送一个异步字符串消息给ActorReceiver
//ActorReceive接收到该消息后，打印出来

object _03ActorDemo {

  // 1. 创建两个Actor(ActorSender,ActorReceiver)
  object ActorSender extends Actor {

    override def act(): Unit = {
      // 发送一个字符串信息给ActorReceiver
      // 使用 !以异步的方式发送字符串信息
      ActorReceiver ! "你好！"

    }
  }

    object ActorReceiver extends Actor{
      override def act(): Unit = {

        receive{
          case msg:String => println(msg)
        }

      }
    }

    // 2.启动Actor,发送异步信息
    def main(args: Array[String]): Unit = {
      ActorSender.start()
      ActorReceiver.start()

    }
  // 3. 接收消息

}
