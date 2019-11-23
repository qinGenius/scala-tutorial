package com.eagle.fpinscala.gettingstarted

object Factorial {
  def factorial(x:Int):Int={
    /**
      * unlike Java, in Scala, we can define functions inside any block,
      * including within another function definition
      */
    def go(x:Int,acc:Int):Int={
      if (x<=0) acc
      else go(x-1,x*acc)
    }

    go(x,1)
  }
  def main(args: Array[String]): Unit = {
    val result=factorial(3)
    println(result)
    val result2=List(1,2,3).reduceLeft((x,y) => x*y)
    println(result2)
  }
}
