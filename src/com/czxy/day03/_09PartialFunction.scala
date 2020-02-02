package com.czxy.day03

/*
 * @Auther: 传智新星
 * @Date: 2020/1/29 19:12
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _09PartialFunction {

  def main(args: Array[String]): Unit = {

    // 1.定义一个列表 1 - 10
    val list = (1 to 10).toList

    // 2. 还有集合函数式操作来进行数据的转换
    // 这里使用偏函数简化了map的函数定义
    val stringList = list.map{

      case x if x >= 1 && x <=3 => "[1-3]"
      case x if x >= 4 && x <=8 => "[4-8]"
      case _ => "(8,*)"

    }

    println(stringList)
  }

}
