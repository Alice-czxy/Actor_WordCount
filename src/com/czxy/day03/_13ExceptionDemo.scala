package com.czxy.day03

/*
 * @Auther: 传智新星
 * @Date: 2020/1/30 09:07
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _13ExceptionDemo {

  def main(args: Array[String]): Unit = {


    // 使用try...catch 来捕获异常
    try{

      val a = 10 / 0
    }

    catch {
      // 打印异常
      case ex:Exception => ex.printStackTrace()
    }

    println("程序继续执行!")
  }
}
