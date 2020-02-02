package com.czxy.day01.demo01

/*
 * @Auther: 传智新星
 * @Date: 2020/1/15 13:48
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */

object test03 {

  def main(args: Array[String]): Unit = {

    // 元组定义
    var a = ("zhangsan","lisi",500)
    // 访问第二个元素(下标从1开始算起)
    println(a._2)

    // 创建集Set
    val set = Set(1,3,4,1,2,5)
    // 去重后的长度
    println(set.size)

     println("==================")
    for (i <- set){
      println(i)

    }






  }

}
