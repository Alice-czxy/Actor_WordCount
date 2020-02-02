package com.czxy.day02

/*
 * @Auther: 传智新星
 * @Date: 2020/1/20 17:03
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _08ClassObjectDemo {

  // 1. 定义Customer类
  // 2. 定义主构造器
  class Customer(var name:String = "",var address : String = ""){
    // 3. 定义辅助构造器
    def this(data:Array[String]) {
      // 第一行代码必须调用主或者其他构造器
      this(data(0), data(1))

    }

  }

  // 40 使用辅助构造器来创建对象
  def main(args: Array[String]): Unit = {

    val customer = new Customer(Array("张三","北京 "))

    println(customer.name)
    println(customer.address)



  }



}
