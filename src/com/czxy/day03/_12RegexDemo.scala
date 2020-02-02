package com.czxy.day03

/*
 * @Auther: 传智新星
 * @Date: 2020/1/29 20:32
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _12RegexDemo {

  def main(args: Array[String]): Unit = {

    // 实现将邮箱列表转换为邮箱运营商名称列表
    // 1. 定义一个用于匹配邮箱的正则表达式(使用正则中的括号来进行分组)
    val regex = """.+@(.+)\..+""".r

    // 2. 定义一个邮箱列表
    var emlList = List("38123845@qq.com", "a1da88123f@gmail.com", "zhansan@163.com", "123afadff.com")

    // 3. 使用集合的函数式操作来进行转换
    val companList = emlList.map {

      case eml@regex(company) => s"${eml} -> ${company}"
      // 未匹配到则进行下面的匹配
      case eml => s"${eml} -> 未知"

    }

    // 输出结果
    println(companList)



  }
}
