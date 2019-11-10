package com.eagle.controlabstraction

object CurryTest {
  //define a curried function
  def curriedSum(a:Int)(b:Int):Int= a+b

  def first(a:Int):Int=>Int=(b:Int) => a+b

  def main(args: Array[String]): Unit = {
    //curriedSum(1)(2)=>等价与first(1)  second(2)
    //具体的调用如下所示:
//    println(curriedSum(1)(2))
    val second=first(1)
    val result=second(2)
    println(result)

    val twoPlus=curriedSum(2)_
    println(twoPlus(8))
  }

}
