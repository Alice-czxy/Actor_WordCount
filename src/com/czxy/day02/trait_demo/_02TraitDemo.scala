package com.czxy.day02.trait_demo

/*
 * @Auther: 传智新星
 * @Date: 2020/1/23 17:36
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _02TraitDemo {

  // 1. 创建两个特质，分别定义两个抽象方法
  trait MessageSender{
    def send(msg: String)

  }

  trait MessageReceiver{
    def receive():String

  }

  // 2. 定义一个实现类，实现这两个特质
 class MessageWorker extends MessageSender with MessageReceiver{

    override def send(msg: String): Unit = println("发送消息："+msg)


    override def receive(): String = "接收消息：你好!我的名字叫一个好人!"

  }

  // 3. 创建实现类的对象，调用这两个方法
  def main(args: Array[String]): Unit = {

    val worker = new MessageWorker

    worker.send("你好!我是一个坏人")

    println(worker.receive())


  }
}
