package com.czxy.day02.trait_demo

import java.text.SimpleDateFormat
import java.util.Date

/*
 * @Auther: 传智新星
 * @Date: 2020/1/24 09:48
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */

/**
  *  trait中定义具体的字段和抽象的字段
  */
object _05TraitDemo {

  // 1. 创建一个Logger特质
  trait Logger{

    // 1.1 具体字段SimpleDateFormat
    val simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm")
    // 1.2 抽象字段TYPE输出的信息
    val TYPE:String
    // 1.3 抽象方法Log
    def log(msg:String)

  }

  // 2. 定义一个实现类
  class ConsoleLogger extends Logger{

    override val TYPE: String = "控制台消息:"

    // 这里使用了插值表达式
    override def log(msg: String): Unit = println(s"${TYPE}:${simpleDateFormat.format(new Date)}:${msg}")

  }

  // 创建实现类对象，调用日志log方法
  def main(args: Array[String]): Unit = {
    
     val logger = new ConsoleLogger
    logger.log("你是一个好人!")
    
  }

}
