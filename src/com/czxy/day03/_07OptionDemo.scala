package com.czxy.day03

/*
 * @Auther: 传智新星
 * @Date: 2020/1/29 15:43
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _07OptionDemo {

    // 1. 定义一个相除的方法，会使用Option来封装结果
    def div(x:Double,y:Double)={

      if (y == 0){
        //表示没有数据
        //返回一个None对象
        //有效地避免了空指针异常!
        None

      }else {
       val result = x / y
        //some 表示有数据
        Some(result)
      }
    }


    // 2. 可以使用模式匹配来判断是否有值
    def main(args: Array[String]): Unit = {

      val some = div(10.0,2.0)
      val none = div(10.0,0)

//      some match {
//        case Some(x) => println(x)
//        case None => println("除零异常!")
//    }

      // 使用getOrElse, 获取不到值就返回0
      val result1 = some.getOrElse(0)
      val result2 = none.getOrElse(0)


      println(result1,result2)

  }

}
