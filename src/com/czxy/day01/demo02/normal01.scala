package com.czxy.day01.demo02

/*
 * @Auther: 传智新星
 * @Date: 2020/1/20 10:04
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object normal01 {

  def main(args: Array[String]): Unit = {


    // 定义一个列表,保存元组类型的数据
    val a = List("张三"->"男","李四"->"女","王五"->"男")

    //按照性别进行分组
    val b = a.groupBy(x=>x._2)

    //把分组后的结果进行一个映射
    val c = b.map(x =>  x._1 -> x._2.size)

    //把map映射完后结果转换成列表

    for(i <- c){

      println(i)
    }
    println(c)


  }
}
