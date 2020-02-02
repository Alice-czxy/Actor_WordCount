package com.czxy.day02

import java.text.SimpleDateFormat
import java.util.Date

/*
 * @Auther: 传智新星
 * @Date: 2020/1/21 09:51
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _11ObjectDemo {

  // 1.创建一个DateUtil 工具类
  object DateUtil {

    val simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd")

    // 2.定义一个用于日期格式化的方法
    def format(date: Date) = simpleDateFormat.format((date))

  }


  // 3.测试格式化日期
  def main(args: Array[String]): Unit = {

    val now = new Date()

    // 输出结果
    println(DateUtil.format(now))



  }
}