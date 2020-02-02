package com.czxy.day02.trait_demo

/*
 * @Auther: 传智新星
 * @Date: 2020/1/26 10:49
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _08TraitDemo {

  // 1. 定义一个trait(Handler Trait)
  trait HandlerTrait {
    def handler(data: String) = {
      println("处理支付数据...")
    }
  }
  // 2. 定义两个trait（数据校验，前面校验）
  trait DataValidateTrait extends HandlerTrait {
    override def handler(data: String): Unit = {
      println("数据校验...")
      super.handler(data)
    }
  }
  trait SignatureValidateTrait extends HandlerTrait {
    override def handler(data: String): Unit = {
      println("签名校验...")
      super.handler(data)
    }
  }
  // 3. 定义一个支付服务类，继承数据校验，前面校验的trait
  class PayService extends DataValidateTrait with SignatureValidateTrait{
    override def handler(data: String): Unit = {
      println("准备支付...")
      super.handler(data)
    }
  }
  // 4. 创建支付服务对象，调用支付方法
  def main(args: Array[String]): Unit = {
    val service = new PayService
    service.handler("支付数据")
  }
}
