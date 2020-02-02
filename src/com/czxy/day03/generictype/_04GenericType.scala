package com.czxy.day03.generictype

/*
 * @Auther: 传智新星
 * @Date: 2020/1/30 15:20
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _04GenericType {

  // 1. 定义类和子类
  class Person
  class Policeman extends Person
  class Superman extends Policeman


  // 2. 定义泛型方法，指定泛型的类型上下界
  def demo[T >: Policeman <: Person](array: Array[T])={
    println(array)
  }

  // 3. 调用demo方法，传入不同类型的数据进行测试
  def main(args: Array[String]): Unit = {
    demo(Array(new Person))
    demo(Array(new Policeman))

    // 编译报错：String类型并不是Person类型或者是它的子类
    // demo(Array(new Superman))

  }
}
