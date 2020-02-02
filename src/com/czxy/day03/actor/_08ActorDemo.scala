package com.czxy.day03.actor

import scala.actors.{Actor, Future}

/*
 * @Auther: 传智新星
 * @Date: 2020/1/31 20:29
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _08ActorDemo {

  // 封装样例类
  case class Message(id:Int,message:String)
  case class ReplyMessage(message:String,name:String)


  // 1. 创建Actor，接收消息，回复消息
  object MsgActor extends Actor{
    override def act(): Unit = {

      loop{
        react{
          case Message(id,message) => println(s"${id},${message}")

          // 回复一个Rely消息
          sender ! ReplyMessage("我不好","韩梅梅")

        }
      }
    }
  }

  // 2. 启动Actor，发送异步有返回的消息
  def main(args: Array[String]): Unit = {
    MsgActor.start()

    // future表示【将来】会返回一个数据
    val future: Future[Any] = MsgActor !! Message(1, "你好")

    // 3. 获取打印返回消息
    // 3.1 提前通过一个循环等到future中有数据，再执行
    // 3.2 调用future.isSet 方法就可以判断，数据是否已经被接收到
    // 因为此处就一个future,因此不需要对future的数量进行一个判断
    while (!future.isSet){ }

    // 3.3 使用future的apply方法可以获取数据
    val replyMessage = future.apply().asInstanceOf[ReplyMessage]
    println(s"接收到回复消息:${replyMessage.message},${replyMessage.name}")

  }

}
