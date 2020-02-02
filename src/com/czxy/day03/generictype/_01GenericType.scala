package com.czxy.day03.generictype

/*
 * @Auther: 传智新星
 * @Date: 2020/1/30 11:14
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _01GenericType {

  // 1. 定义一个方法获取数组的中间元素
  def getMiddleEle[T](array: Array[T]) = array(array.length/2)

  // 2. 调用该方法
  def main(args: Array[String]): Unit = {

    println(getMiddleEle(Array(1,2,3,4,5)))
    println(getMiddleEle(Array("a","b","c","d","e")))
    println(getMiddleEle(Array(1.0,2.0,3.0,4.0,5.0)))

  }
}
