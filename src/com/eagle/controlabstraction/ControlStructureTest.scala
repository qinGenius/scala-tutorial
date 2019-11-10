package com.eagle.controlabstraction

object ControlStructureTest {

  def twice(op: Double => Double, x: Double) = op(op(x))

  def test(x: Double, y: Double): Double = x + y

  //数学中的四种运算：加 减 乘 除
  //注意(Double, Double) => Double 【=> 符号左边有多个类型时必须要有小括号（）】
  def calculate(op: (Double, Double) => Double, x: Double, y: Double) = op(x, y)

  def main(args: Array[String]): Unit = {
    val result = twice(_ + 5, 1) //11
    println(result)
    val add = calculate((x, y) => x + y, 5, 6)
    val multiply = calculate((x, y) => x * y, 5, 6)
    val divide = calculate((x, y) => x / y, 45, 5)
    val subtract = calculate((x, y) => x - y, 5, 1)
    println("add=" + add)
    println("multiply=" + multiply)
    println("divide=" + divide)
    println("subtract=" + subtract)
  }
}
