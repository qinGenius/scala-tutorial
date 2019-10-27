package com.eagle.nextstepinscala.array

/**
  * 一次性给数组赋值：
  * 用Array.apply()方法即可
  * @author qinlinsen
  */
object ArrayTest3 {

  def main(args: Array[String]): Unit = {
    /**
      * 显示方法一次性给数组赋值
      */
    val arr:Array[Int]=Array.apply(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16);
    arr.foreach(arg => print(arg+" "))
    //换行
    println()
    println("--------------------------------------------------------------")
    //换行
    println()
    /**
      * 隐式的一次性给数组赋值
      */
    val arrAnother=Array(1,3,5,7,0)
    arrAnother.foreach(arg => print(arg+" "))
  }
}
