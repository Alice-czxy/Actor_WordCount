package com.czxy.day03.generictype

/*
 * @Auther: 传智新星
 * @Date: 2020/1/30 15:14
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _03GenericType {

  // 1.创建一个类和它的子类
  class Person
  class Student extends Person

  // 2.创建一个泛型方法,并且给泛型方法指定一个上界
  def demo[T <: Person](array: Array[T]) = println(array)

  // 3.使用不同的类型来调用泛型方法
  def main(args: Array[String]): Unit = {

    demo(Array(new Person))
    demo(Array(new Student))

    // 编译报错：String类型并不是 Person 类型或  Person的子类
    // demo(Array("string"))

  }




}
