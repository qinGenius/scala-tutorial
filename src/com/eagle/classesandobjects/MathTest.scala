package com.eagle.classesandobjects

class MathTest {
  /**
    * 返回两个数中的较大值
    *
    * @param a 比较的第一个数
    * @param b 比较的第二个数
    * @return
    */
  def max(a: Int, b: Int): Int = if (a >= b) a else b

  /**
    * 返回两个数中的较小值
    * 在scala中方法可以省略的部分是
    * 第一个是方法的返回值可以省略
    * 第二个是方法的返回类型可以省略（但是这部分官方建议不要省略，如果省略的话，读代码的人需要思考返回什么值）
    * 第三个是方法体中的大括号可以省略当满足只有一个表达式语句时的条件时，如果这个表达式过很短那么可以与
    * def写在一行
    */
  def min(a: Int, b: Int): Int = if (a >= b) b else a

  //这个方法把函数的返回值也省略了
  def min2(a: Int, b: Int) = if (a >= b) b else a

/*
  /**
    * 在这下面运行是无效的
    */
  def main(args: Array[String]): Unit = {
    val max = max(2, 3);
    println(max)
  }
*/

}
