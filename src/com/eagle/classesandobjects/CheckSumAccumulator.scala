package com.eagle.classesandobjects

/**
  * scala程序的入口是standalone object的main 方法
  * 在scala类中写main方法是无法运行一个程序的
  */

object CheckSumAccumulator {

  def main(args: Array[String]): Unit = {
    val result = new MathTest().max(1, 2);
    println(result)
  }
}
