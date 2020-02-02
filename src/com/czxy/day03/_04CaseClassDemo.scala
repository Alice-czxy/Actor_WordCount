package com.czxy.day03

/*
 * @Auther: 传智新星
 * @Date: 2020/1/27 10:09
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _04CaseClassDemo {
    // 1. 创建样例类
  case class Person(name:String, age:Int)

    // 2. 创建两个对象，打印哈希值
    def main(args: Array[String]): Unit = {

      val person1 = Person("李四",21)
      val person2 = Person("李四",22)

      // 如果所有成员变量的值相同，则hash值相同，
      // 只要有一个不一样，则hash值不一样。
      println(person1.hashCode())
      println(person2.hashCode())
    }
}
