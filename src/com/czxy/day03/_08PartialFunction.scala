package com.czxy.day03

/*
 * @Auther: 传智新星
 * @Date: 2020/1/29 19:07
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _08PartialFunction {

  def main(args: Array[String]): Unit = {

    // 1. 定义一个偏函数
    var partialFunction : PartialFunction[Int,String] = {
      case 1 => "一"
      case 2 => "二"
      case 3 => "三"
      case _ => "其他"
    }

    // 调用偏函数
    println(partialFunction(1))
    println(partialFunction(2))
    println(partialFunction(3))
    println(partialFunction(4))
  }

}
