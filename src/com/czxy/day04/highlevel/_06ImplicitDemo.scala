package com.czxy.day04.highlevel

import java.io.File

import scala.io.Source

/*
 * @Auther: 传智新星
 * @Date: 2020/1/31 09:44
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _06ImplicitDemo {

  // 1. 创建拓展类，实现对File的拓展，读取文件内容
class RichFile(var file: File){

    def read()={

      //将文件内容读取为字符串
      Source.fromFile(file).mkString

    }
  }

  // 3. 导入隐式转换，测试读取文件内容
  def main(args: Array[String]): Unit = {

    val file = new File("./data/1.txt")

    // 将隐式导入放到与调用同一个作用域下，就可以做到自动导入
    implicit def fileToRichFile(file: File) = new RichFile(file)

    // 调用隐式转换的方法
    println(file.read())

  }

}
