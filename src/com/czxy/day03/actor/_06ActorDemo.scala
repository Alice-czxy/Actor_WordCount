package com.czxy.day03.actor

import scala.actors.Actor
import scala.swing.Dialog.Message

/*
 * @Auther: 传智新星
 * @Date: 2020/1/31 16:10
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _06ActorDemo {
  // 1. 创建Actor，接收消息，回复消息
  object MsgActor extends Actor{
    override def act(): Unit = {
      loop{
        receive{
          case Message(id,message) => {
            println(s"接收到消息:${id},${message}")
            // 回复消息
            sender ! ReplyMessage("我不好","张三")

          }

        }
      }
    }
  }
  // 定义一个自定义消息【样例类->封装数据】
  case class Message(id:Int,message:String)

  // 定义样例类封装消息
  case class ReplyMessage(message: String,name:String)

  // 2. 启动Actor,发送消息
  def main(args: Array[String]): Unit = {
    MsgActor.start()

    // 发送同步自定义消息【同步发送有返回值】
    val reply:Any = MsgActor !? Message(1,"你好")

    // 3. 打印回复消息
    if (reply.isInstanceOf[ReplyMessage]){

      // 打印结果
      println(reply.asInstanceOf[ReplyMessage])

    }
  }
}
