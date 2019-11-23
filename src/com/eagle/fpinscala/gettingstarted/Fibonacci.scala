package com.eagle.fpinscala.gettingstarted

/**
  * EXERCISE 1 (optional): Write a function to get the nth Fibonacci number. The
  * first two Fibonacci numbers are 0 and 1, and the next number is always the sum of
  * the previous two. Your definition should use a local tail-recursive function
  *
  * 0 1 1 2 3 5 8 13 21
  *
  * f(n)=f(n-1)+f(n-2)
  * f(3)=f(2)+f(1)
  *
  * f(4)=f(3)+f(2)
  *
  * go(4)=go(3)
  */
object Fibonacci {
  def fibonacci(n:Int): Int ={
      def go(n:Int,previous:Int,current:Int):Int={
        if(n==0) previous
        else go(n-1,current,current+previous)
      }
      go(n,0,1)
    }



  def main(args: Array[String]): Unit = {
   val result= fibonacci(8);
    println(result)
  }
}
