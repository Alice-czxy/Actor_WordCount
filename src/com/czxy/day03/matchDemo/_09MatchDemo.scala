package com.czxy.day03.matchDemo

/*
 * @Auther: 传智新星
 * @Date: 2020/1/29 14:49
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
// 生成包含0-10数字的列表，使用模式匹配分别获取第一个、第二个元素
object _09MatchDemo {
  def main(args: Array[String]): Unit = {
    // 1. 生成0-10列表
    val list = (0 to 10).toList

    // 2. 在定义声明变量的时候，使用模式匹配，来匹配第一个，第二个元素
    val x :: y :: tail = list
    //val List(x,y,_*) = list
    println(x,y)

  }

}
