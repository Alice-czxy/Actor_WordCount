package com.czxy.day01.demo02

/*
 * @Auther: 传智新星
 * @Date: 2020/1/20 10:23
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object normal02 {

  def main(args: Array[String]): Unit = {


    val a = List(0,1,2,3,4,5,6,7,8,9)

    // 折叠
    val b = a.fold(0)(_ + _)

    println(b)

  }
}
