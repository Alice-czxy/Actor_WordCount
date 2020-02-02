package com.czxy.day03.matchDemo

/*
 * @Auther: 传智新星
 * @Date: 2020/1/29 09:23
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _02MatchDemo {

  def main(args: Array[String]): Unit = {

    // 1. 定义Any 类型的变量【Any是所有数值类型的父类】
    // 分别赋值: "hadoop",1,1.0
     val a:Any = "hadoop"
    // val a:Any = 1
    // val a:Any = 1.0
     //val a:Any = null


    // 2. 使用模式匹配来匹配数据类型
   a match {
      case x:String => println(s"${x}是字符串类型")
      case x:Int => println(s"${x}是整形")
      case x:Double => println(s"${x}是双精度浮点型")
      case _ => println("未匹配")
    }

  }
}
