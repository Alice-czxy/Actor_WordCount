package com.czxy.day04.highlevel

/*
 * @Auther: 传智新星
 * @Date: 2020/1/30 20:53
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _02FuncDemo {
  def main(args: Array[String]): Unit = {
    // 使用匿名函数简化代码编写
    val startList1 = (1 to 10).map(x => "*"*x)

    println(startList1)

    // 使用下划线来简化代码编写
    val startList2 = (1 to 10).map("*" * _)
    println(startList2)

  }

}
