package com.czxy.day01.demo01

import scala.util.control.Breaks._

object test01 {


  def main(args: Array[String]): Unit = {
    println("Hello, world!")

    // 实现的是break的效果
//    breakable{
//
//      for (i <- 1 to 20){
//
//        if (i >= 10) break()
//
//        else println(i)
//
//      }
//
//    }

    //实现的是continue的效果
    for (i <- 1 to 20){

      breakable{

        if (i >= 10) {
          break()

        } else {

          println(i)

        }
      }
    }
  }

}
