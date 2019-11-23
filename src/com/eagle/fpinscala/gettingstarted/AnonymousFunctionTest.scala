package com.eagle.fpinscala.gettingstarted

/**
  * anonymous function also often called function literals, lambda functions, lambda expressions,
  * or just lambdas
  */
object AnonymousFunctionTest {
  def operation(a:Int,b:Int,f:(Int,Int) => Int):Int={
    f(a,b)
  }
  def main(args: Array[String]): Unit = {
    /**
      * In this last form _ + 1, sometimes called underscore syntax for a function literal,
      * we are not even bothering to name the argument to the function,
      * using _ represent the sole argument. When using this notation,
      * we can only reference the function parameter once in the body of the function
      * (if we mention _ again,
      * it refers to another argument to the function)
      */
    val result = MyModule.formatResult("increment",1, _ +1)
    println(result)
    //_ - _  第一个underscore代表函数的第一个参数，第二个underscore代表函数的第二个参数
    val subtract=operation(1,3,_ - _)
    val add=operation(1,3,_ + _)
    val multiply=operation(1,3,_ * _)
    val divide=operation(3,1,_ / _)
    println(s"subtract=${subtract}")
    println(s"add=${add}")
    println(s"multiply=${multiply}")
    println(s"divide=${divide}")
  }
}
