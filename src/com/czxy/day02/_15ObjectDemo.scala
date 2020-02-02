package com.czxy.day02

/*
 * @Auther: 传智新星
 * @Date: 2020/1/21 10:46
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _15ObjectDemo {

   // 1.创建Person类,定义一个private[this]成员变量
  class Person(private /*[this]*/  var name:String)


  //2. 创建Person伴生对象,在伴生对象中测试访问成员变量
  object Person {

    def printPerson(p:Person) = println(p.name)

  }


  // 3.定义一个main方法,调用伴生对象的方法
  def main(args: Array[String]): Unit = {
    Person.printPerson(new Person("张三"))

  }
}
