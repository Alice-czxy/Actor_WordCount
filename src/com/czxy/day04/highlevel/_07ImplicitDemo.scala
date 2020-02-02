package com.czxy.day04.highlevel

/*
 * @Auther: 传智新星
 * @Date: 2020/1/31 10:06
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _07ImplicitDemo {

  // 1. 定义一个方法，这个方法有一个隐式参数
  def quote(what:String)(implicit delimeters:(String,String))={

    delimeters._1 + what + delimeters._2
  }

  // 2. 定义一个隐式参数
  // 在object中定义implicit修饰的隐式值
  object ImlicitDemo {

    implicit val delimeterParam = ("<<", ">>")

  }
    // 3.调用方法执行测试
    def main(args: Array[String]): Unit = {

      import ImlicitDemo._

      println(quote("你好"))


    }

  }

