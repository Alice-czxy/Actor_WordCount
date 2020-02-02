package com.czxy.day03.wordcount

/*
 * @Auther: 传智新星
 * @Date: 2020/1/31 22:28
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
case class WordCountTask(fileName:String)

  /**
    * 封装单词统计的结果
    * @param wordCountMap 单词-单词在某个文件中出现的数量
    */
case class WordCountResult(wordCountMap: Map[String, Int])