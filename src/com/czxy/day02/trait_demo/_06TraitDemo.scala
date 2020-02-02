package com.czxy.day02.trait_demo

/*
 * @Auther: 传智新星
 * @Date: 2020/1/26 09:46
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _06TraitDemo {

  // 1. 定义一个trait
  // 具体方法会调用抽象方法，输出不同级别的日志
  trait Logger {
    def log(msg:String)

    // 具体方法定义,调用抽象方法
    def info(msg:String)= log("信息:"+msg)
    def warn(msg:String)= log("警告:"+msg)
    def error(msg:String)= log("错误:"+msg)

  }

  // 2. 定义一个实现类，实现trait
class ConsoleLogger extends Logger{

    override def log(msg: String): Unit = println(msg)

  }

  def main(args: Array[String]): Unit = {

    // 3.创建实现类对象，调用不同级别的日志进行输出
    val logger = new ConsoleLogger

    logger.info("Call Action method")
    logger.warn("person 变量没有被使用")
    logger.error("NullPoint Exception")

  }

}
