package com.czxy.day03.wordcount

/*
 * @Auther: 传智新星
 * @Date: 2020/2/1 09:46
 * @Description: 
    流年笑掷 未来可期。以梦为马,不负韶华!
 */
object WordCountUtil {

  def reduce(wordAndCountList: List[(String, Int)]) = {
    // 4. 分组、聚合计算
    // {hadoop->List(<hadoop,1>,<hadoop,1>), sqoop->List(<sqoop,1>)}
    val groupedMap: Map[String, List[(String, Int)]] = wordAndCountList.groupBy(_._1)

    // 聚合计算
    // {hadoop->2, sqoop->1}
    val wordCountMap: Map[String, Int] = groupedMap.map{
      keyVal =>
        keyVal._1 -> keyVal._2.map(_._2).sum
    }

    wordCountMap
  }
}
