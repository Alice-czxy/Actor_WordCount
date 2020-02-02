package com.czxy.day02

/*
 * @Auther: 传智新星
 * @Date: 2020/1/21 09:26
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _09ClassObjectDemo {

  // 1. 创建单例对象
  object Dog {
    // 定义了一个单例对象的成员
    // 类似于Java中的static变量
    val LEG_NUM = 4

  }

  //2.访问单例对象中的成员变量
  def main(args: Array[String]): Unit = {

    // + prtln 回车
    println(Dog.LEG_NUM)

  }
}
