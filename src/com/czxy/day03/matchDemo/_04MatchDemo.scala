package com.czxy.day03.matchDemo

/*
 * @Auther: 传智新星
 * @Date: 2020/1/29 09:57
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _04MatchDemo {

  // 1. 创建两个样例类
  case class Person(name: String, age: Int)

  case class Order(is: String)

  def main(args: Array[String]): Unit = {
    // 2. 创建样例类对象，并赋值为Any类型
    val zhangsan:Any  = Person("张三", 20)
    val order:Any = Order("001")


    // 3. 使用match...case表达式来进行模式匹配
    // 获取样例类中的成员变量
    zhangsan match {

      case Person(name,age) => println(s"姓名:${name} 年龄:${age}")
      case Order(id) => println(s"ID为:${id}")
      case _ => println("未匹配")
    }
  }
}
