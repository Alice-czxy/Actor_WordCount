package com.czxy.day03.generictype

/*
 * @Auther: 传智新星
 * @Date: 2020/1/30 15:32
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _05GenericType {
  // 1. 创建一个测试类 和 子类
  class Super
  class Sub extends Super

  // 2. 分别创建使用协变，逆变，非变的泛型类
  // 非变（默认）
  class Temp1[T]
  // 协变
  class Temp2[+T]
  // 逆变
  class Temp3[-T]

  // 3. 测试协变，逆变，非变(类型转换)
  def main(args: Array[String]): Unit = {

    val tmp1: Temp1[Sub]= new Temp1[Sub]
    // 非变不允许任何的转换
    // val tmp2: Temp1[Super] = tmp1

    // 协变
    val tmp3:Temp2[Sub] = new Temp2[Sub]
    val temp4:Temp2[Super] = tmp3
    // 逆变
   val temp5:Temp3[Super] = new Temp3[Super]
   val tmp6:Temp3[Sub] = temp5




  }

}

