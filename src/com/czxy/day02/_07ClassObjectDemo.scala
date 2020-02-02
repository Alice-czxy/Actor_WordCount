package com.czxy.day02

/*
 * @Auther: 传智新星
 * @Date: 2020/1/20 16:49
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _07ClassObjectDemo {

  // 1. 创建Person类,使用主构造器来进行字段定义和默认值赋值
  // 构造器内无法使用_设置默认值
  class Person(var name:String ="",var age : Int = 0){


    println("调用主构造器!")

  }


  def main(args: Array[String]): Unit = {

    // 2. 使用主构造器来创建对象
    val zhangsan = new Person("张三",20)
    println(zhangsan.name)
    println(zhangsan.age)

    println("-------")

    val person = new Person
    println(person.name)
    println(person.age)

    println("-------")

    val man40 = new Person(age = 40)
    println(man40.name)
    println(man40.age)


  }
}
