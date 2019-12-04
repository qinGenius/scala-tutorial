package com.eagle.fpinscala.handlingerrorwithoutexceptions

/**
  * The technique is based on a simple idea: instead of throwing an exception,
  * we return a value indicating an exceptional condition has occurred.
  *
  *
  *
  *
  *
  * 偏函数是一元函数，仅针对某些域（即输入）值定义。 可以匿名介绍它们。 也可以使用PartialFunction特性定义它们。
  * A partial function is a unary function which is only defined
  * for certain domain (i.e. input) values. They can be introduced anonymously.
  * They can also be defined using PartialFunction trait.
  *
  * @author qinlinsen
  */
object ExceptionTest {
  def failingFn(x:Int): Int ={
    val x:Int=throw new Exception("fails")
    try {
      val y = 42 + 5
      x + y
    } catch {
      case e :Exception => 43
    }

  }

  def mean(xs:Seq[Double]):Double={
    if(xs.isEmpty)
      throw new ArithmeticException("xs cannot be empty")
    else xs.sum/ xs.length
  }

  def mean_1 (xs:IndexedSeq[Double],onEmpty:Double):Double={
    if (xs.isEmpty) onEmpty
    else xs.sum / xs.length
  }

  def mean_2(xs:Seq[Double]):Option[Double]={
    if (xs.isEmpty) None
    else Some(xs.sum / xs.length)
  }

  def main(args: Array[String]): Unit = {
    val meanValue = mean(List(1,2,3,4))
    println(s"meanValue=${meanValue}")

    val meanOne = mean_1(IndexedSeq(5,6,7,10),-1)
    println(s"meanOne=${meanOne}")

    val value = mean_2(List(1,2,3,4)).get
    println(s"value==============${value}")
  }
}
