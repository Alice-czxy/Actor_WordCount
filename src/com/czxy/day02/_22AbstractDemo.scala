package com.czxy.day02

/*
 * @Auther: 传智新星
 * @Date: 2020/1/22 10:52
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _22AbstractDemo {

  // 1. 定义4个类，定义继承关系
  abstract class Shape{

    // 抽象方法，返回值是Double
    // 抽象方法是没有方法体的，没有具体实现
    def area():Double

  }

  /**
    * 正方形
    * @param edge  边长
    */
  class Square(var edge: Double) extends Shape{
    // 快捷键 ctrl + i 选择需要实现的方法
    // 2. 实现求面积的方法
    override def area(): Double = edge * edge

  }

  /**
    * 长方形
    * @param length  长度
    * @param width  宽度
    */
  class Rectangle(var length:Double,var width: Double) extends Shape{

    override def area(): Double = length * width
  }
  /**
    * 圆形
    * @param radius  半径
    */
  class Circle(var radius:Double) extends Shape{

    override def area(): Double = Math.PI * radius * radius

  }

  // 3. 创建实现类的对象，求面积
  def main(args: Array[String]): Unit = {

    val square = new Square(2.0)
    val rectangle = new Rectangle(2.0,1.0)
    val circle = new Circle(2.0)

    // 计算并打印面积
    println(square.area())
    println(rectangle.area())
    println(circle.area())


  }


}
