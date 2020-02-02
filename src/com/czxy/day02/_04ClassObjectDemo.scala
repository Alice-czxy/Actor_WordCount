package com.czxy.day02

/*
 * @Auther: 传智新星
 * @Date: 2020/1/20 16:19
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _04ClassObjectDemo {

  // 1. 创建一个Person类,添加成员变量
  //   使用下划线进行成员变量的初始化
  class Person{

    var name:String = _
    var age :Int = _

  }



  def main(args: Array[String]): Unit = {

    // 2. 创建Person 对象
    val person = new Person

    // 3. 设置Person对象的成员变量值,获取打印成员变量
    person.name = "张三"
    person.age = 20

    // 4.打印结果
    println(person.name)
    println(person.age)


  }

}
