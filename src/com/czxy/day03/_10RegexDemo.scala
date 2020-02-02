package com.czxy.day03

/*
 * @Auther: 传智新星
 * @Date: 2020/1/29 20:13
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object _10RegexDemo {
  def main(args: Array[String]): Unit = {

    // 1.定义一个Regex正则表达式对象
    // qq12344@163.com
    val regex = """.+@.+\..+""".r

    // 2. 使用正则表达式对象匹配数据
    val eml1 = "qq12344@163.com"
    val eml2 = "qq12344@.com"


    // 校验第一个邮箱
    if (regex.findAllMatchIn(eml1).size==0){
      println(eml1+"是一个非法的邮箱!")
    }
    else {
      println(eml1+"是一个合法的邮箱")
    }

    // 校验第二个邮箱
    if (regex.findAllMatchIn(eml2).size==0){
      println(eml2+"是一个非法的邮箱!")
    }
    else {
      println(eml2+"是一个合法的邮箱")
    }


  }


}

