package com.czxy.day03.actor

import java.util.concurrent.TimeUnit

import scala.actors.Actor

/*
 * @Auther: 传智新星
 * @Date: 2020/1/31 15:45
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _05ActorDemo {

  // 1. 创建两个Actor
  // ActorSender -- 每隔1秒发送一个消息
  // ActorReceive -- 不停地接收消息
  object ActorSender extends Actor{
    override def act(): Unit = {

      while (true){
        // 发送异步信息
        ActorReceiver ! "你好"
        // 休息1秒
        TimeUnit.SECONDS.sleep(1)

      }
    }
  }

  object ActorReceiver extends Actor{
    override def act(): Unit = {

    // 使用loop + react 来复用线程，提高执行效率
      loop{
        react{
          case msg:String => println(msg)
        }
      }
    }

  }

  // 2. 启动Actor测试
  def main(args: Array[String]): Unit = {
   ActorSender.start()
   ActorReceiver.start()

  }
}
