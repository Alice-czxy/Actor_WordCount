package com.czxy.day03

/*
 * @Auther: 传智新星
 * @Date: 2020/1/27 10:03
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _03CaseClassDemo {
  // 1. 创建一个样例类
  case class Person(name:String, age:Int)

  // 2. 创建两个样例类的对象，比较是否相等
  def main(args: Array[String]): Unit = {

    val lisi1 = Person("李四",21)
    val lisi2 = Person("李四",211)

    // 比较两个对象是否是同一个对象
    println(lisi1.eq(lisi2))

    // 比较两个对象是否相等
    println(lisi1 == lisi2)


    }
}
