package com.eagle.nextstepinscala.set

import scala.collection.mutable

object MutableSetTest {


  def main(args: Array[String]): Unit = {
    /**
      * 对mutable set 而言可以用val 来进行修饰
      */
    val movieSet = mutable.Set("飞驰人生", "速度与激情", "印度暴徒")
    movieSet+="流浪地球"
    movieSet.+=("绿箭侠");
    movieSet.foreach(println)
    //查看Set集合的总数

    println("movieSet中的集合的总数是："+movieSet.size)
  }
}
