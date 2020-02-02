package com.czxy.day03

/*
 * @Auther: 传智新星
 * @Date: 2020/1/29 20:28
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object test {
  def main(args: Array[String]): Unit = {
    // 1. 定义正则表达式对象
    val regex = """.+@.+\..+""".r

    // 2. 定义一个邮箱列表
    val emlList = List("38123845@qq.com", "a1da88123f@gmail.com", "zhansan@163.com", "123afadff.com")

    // 3. 过滤出来不合法的邮箱列表
    val invalidEmailList = emlList.filter {
      // 过滤出来没有找到匹配的字符串
      case eml if regex.findAllMatchIn(eml).size == 0 => true
      case _ => false
    }

    println(invalidEmailList)
  }
}

