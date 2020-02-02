package com.czxy.day04.highlevel

/*
 * @Auther: 传智新星
 * @Date: 2020/1/30 20:44
 * @Description:
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _01FuncDemo {
  def main(args: Array[String]): Unit = {

    // 1. 创建函数，将数字转换为小星星
    val func: Int => String = (num:Int) => "*" * num

    // 2. 创建列表,执行转换
    val startList = (1 to 10).map(func)

    // 3. 打印测试
    println(startList)


  }

}
