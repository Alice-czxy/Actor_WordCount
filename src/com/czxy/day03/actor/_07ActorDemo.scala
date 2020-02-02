package com.czxy.day03.actor

import scala.actors.Actor

/*
 * @Auther: 传智新星
 * @Date: 2020/1/31 20:23
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _07ActorDemo {
  // 1. 创建一个Actor,打印接收消息
  object MsgActor extends Actor{
    override def act(): Unit = {

      loop{
        react{

          case Message(message,company) => println(s"${message},${company}")

        }
      }

    }
  }

  // 创建样例类封装数据
  case class Message(message:String,company:String)

  // 2. 启动Actor,给Actor发送异步无返回消息
  def main(args: Array[String]): Unit = {

    MsgActor.start()
    // 发送异步无返回消息
    MsgActor ! Message("你好","大爷快交话费!")


  }
}
