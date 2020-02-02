package com.czxy.day03.generictype

/*
 * @Auther: 传智新星
 * @Date: 2020/1/30 15:06
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _02GenericType {
  // 1.创建泛型类,包含两个字段
  class Pair[T](var a: T,var b:T)


  // 2. 创建该泛型类的对象(定义不同的类型的对象)
  def main(args: Array[String]): Unit = {

    val pair1:Pair[String] = new Pair("hadoop","spark")
    val pair2:Pair[Int] = new Pair(1,2)
    val pair3:Pair[Double] = new Pair(1.0,2.0)

    // 打印
    println(pair1.a,pair1.b)
    println(pair2.a,pair2.b)
    println(pair3.a,pair3.b)


  }
}
