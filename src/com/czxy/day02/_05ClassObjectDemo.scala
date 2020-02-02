package com.czxy.day02

/*
 * @Auther: 传智新星
 * @Date: 2020/1/20 16:26
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _05ClassObjectDemo {

  // 1. 创建一个Customer 对象
  class Customer{
    // 1.1 定义成员变量
    var name:String = _
    var sex:String =_

  // 1.2 定义成员方法
  def printHello(msg:String) = {
    println(msg)
  }

  }

  def main(args: Array[String]): Unit = {
    // 2. 创建一个Customer对象，调用成员方法
     val customer = new Customer

    // 3.调用方法
    customer.printHello("你好")

  }



}
