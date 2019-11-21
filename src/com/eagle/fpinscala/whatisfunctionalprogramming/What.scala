package com.eagle.fpinscala.whatisfunctionalprogramming

/**
  * 何为RT(Referential Transparency")
  *
  *
  * Referential transparency and purity
  * An expression e is referentially transparent if for all programs p,
  * all occurrences of e in p can be replaced by the result of evaluating e,
  * without affecting the observable behavior of p.
  *
  * 何为纯函数
  * A function f is pure if the expression f(x)
  * is referentially transparent for all referentially transparent x.1
  */
object What {
  def reversePureFunction(s:String):String={
    s.reverse
  }

  def appendNotPureFunction(s:String,builder: StringBuilder):String={
    builder.append(s)
    builder.toString()
  }
  def main(args: Array[String]): Unit = {
    //-------------多次调用函数的结果未发生变化：纯函数----------------------
    val valueOne = reversePureFunction("hello world")
    val valueTwo = reversePureFunction("hello world")
    val valueThree = reversePureFunction("hello world")
    println(s"valueOne=${valueOne}    valueTwo=${valueTwo}    valueThree=${valueThree}")


    //-------------多次调用函数的结果发生了变化：非纯函数-----------------------
    val builder = new StringBuilder
    val valueFour = appendNotPureFunction("hello",builder)
    val valueFive = appendNotPureFunction("hello",builder)
    val valueSix = appendNotPureFunction("hello",builder)
    println(s"valueFour=${valueFour}    valueFive=${valueFive}    valueSix=${valueSix}")
  }
}
