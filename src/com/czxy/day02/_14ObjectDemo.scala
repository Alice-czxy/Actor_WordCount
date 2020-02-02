package com.czxy.day02

/*
 * @Auther: 传智新星
 * @Date: 2020/1/21 10:41
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _14ObjectDemo {

  // 1.创建一个伴生类
  class CustomerService {

    def save()={
      println(CustomerService.SERVICE_NAME+":保存客户")

    }
  }

  // 2.创建一个伴生对象
  object CustomerService{
    // 定义一个私有变量
    // 服务类的名称
    private val SERVICE_NAME = "CustomerService"

  }


  // 3.创建对象,调用方法
  def main(args: Array[String]): Unit = {

    val service = new CustomerService

    service.save()

  }
}
