package com.eagle.basictypesandoperations

/**
  * scala 中的占位符有3中形式：
  * 分别是：s  raw  f
  * 占位符实现的原理是在编译阶段重写代码
  * In Scala, string interpolation is implemented by rewriting code at com- pile time.
  * The compiler will treat any expression consisting of an identifier
  * followed immediately by the open double quote of a string literal
  * as a string interpolator expression.
  * String 占位符的用法
  */
object StringInterpolationTest {

  def main(args: Array[String]): Unit = {
    val name="人民"
    val location="冉家坝"
    //注意下面这个语句的s 不能省略，这个s叫string interpolator（字符串占位符）
    println(s"我的名字叫$name，家住在重庆市$location")

    val max=if(3>2) "3大" else "2大";

    println(s"3与2谁大：$max")

    println(s"6*7=${6*7}")
    //带raw打印的结果写什么就打印什么
    println(raw"No\\\\escape")
    //不带raw 转义字符不打印
    println("No\\\\escape")

    //pi 保留小数点后5位
    println(f"${math.Pi}%.5f")

  }
}
