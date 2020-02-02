package com.czxy.day04.highlevel

/*
 * @Auther: 传智新星
 * @Date: 2020/1/30 21:03
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _03FuncDemo {
  // 1. 定义一个方法（柯里化）,计算两个 Int 类型的值
  // 两个参数列表
  // 第一个为两个自由参数
  // 第二个为一个函数
  def calculate(a:Int , b:Int)(calc: (Int,Int)=>Int)={

    calc(a,b)
  }

  // 2.调用柯里化方法
  def main(args: Array[String]): Unit = {

    println(calculate(1,2)(_+_))
    println(calculate(1,2)(_*_))
    println(calculate(1,2)(_-_))

  }
}
