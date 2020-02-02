package com.czxy.day03

/*
 * @Auther: 传智新星
 * @Date: 2020/1/30 09:19
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
/**
  * 通过实现提取器,让普通的类(非样例类)能够支持模式匹配
  *
  */
object _15UnapplyDemo {

  // 1. 定义一个普通的类
  class Student(var name: String, var age: Int)

  // 2. 实现unapply方法来定义提取器
  object Student {
    def unapply(student: Student): Option[(String, Int)] =

      if (student != null) {
        // 返回一个Some封装数据   -- 供下面模式匹配使用
        Some(student.name, student.age)

      }
      else {
        None
      }

  }

def main (args: Array[String] ): Unit = {

  // 3. 创建对象,使用模式匹配来提取值
  val student = new Student("张三",20)

  student match {

    case Student(name, age) => println(s"${name},${age}")

  }

}

}
