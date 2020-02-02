package com.czxy.day03.actor

import java.util.concurrent.TimeUnit

import com.czxy.day03.actor._03ActorDemo.ActorReceiver

import scala.actors.Actor

/*
 * @Auther: 传智新星
 * @Date: 2020/1/31 15:45
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _04ActorDemo {

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
      while (true){
        // receive 接收的是一个偏函数
        receive{
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
