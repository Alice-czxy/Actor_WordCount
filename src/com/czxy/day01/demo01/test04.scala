package com.czxy.day01.demo01

/*
 * @Auther: 传智新星
 * @Date: 2020/1/20 10:55
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object test04 {

  def main(args: Array[String]): Unit = {

    for(i <- 1 to 3; j <- 1 to 5){

      print("*")

      if (j==5){
        println("")

      }

    }

    val v = for(i <- 1 to 10) yield i * 10
    println(v)


  }
}
