package com.czxy.day01.demo01

/*
 * @Auther: 传智新星
 * @Date: 2020/1/13 20:04
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object test02 {


  def main(args: Array[String]): Unit = {


    //通常Unit只用来声明函数或方法的返回值,相当于java的void:
    def function01(x:Int = 0,y:Int = 1): Unit ={

      println(x + y)

    }

    function01(1,2)

    // 可变参数
    def function02(num:Int*): Unit ={

      println(num.sum)

    }

    function02(1,2,3,4,5,6)

  }
}
