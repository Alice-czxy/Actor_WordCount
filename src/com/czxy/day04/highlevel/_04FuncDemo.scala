package com.czxy.day04.highlevel


/*
 * @Auther: 传智新星
 * @Date: 2020/1/30 21:12
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _04FuncDemo {

  def main(args: Array[String]): Unit = {

    val  y = 10

    // 定义一个函数，访问函数作用域外部的变量
    val add: Int => Int = (x:Int) => x+y
    println(add(1))

  }
}
