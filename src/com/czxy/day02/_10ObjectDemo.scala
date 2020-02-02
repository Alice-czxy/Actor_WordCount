package com.czxy.day02

/*
 * @Auther: 传智新星
 * @Date: 2020/1/21 09:31
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _10ObjectDemo {

  // 1. 创建一个单例对象，定义成员方法
  object PrintUtil {

    // 在object中定义成员方法与定义方法一样
    def printSpliter()={

      println("-" * 15)

    }
  }

  def main(args: Array[String]): Unit = {
    PrintUtil.printSpliter()


  }
}


