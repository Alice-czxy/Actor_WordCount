package com.czxy.day02

/*
 * @Auther: 传智新星
 * @Date: 2020/1/21 14:35
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _16ObjectDemo {

  // 1. 创建Person 类
  class Person(var name:String, var age:Int)

  // 2. 创建Person伴生对象
  object Person{
    // 2.1 在伴生对象中定义apply方法
    def apply(name:String,age:Int) = new Person(name,age)

  }

  // 3.使用类名来快速创建爱对象
  def main(args: Array[String]): Unit = {

    val zhangsan = Person("张三",20)

    println(zhangsan.name)
    println(zhangsan.age)



  }


}
