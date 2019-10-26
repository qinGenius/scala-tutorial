package com.eagle.firststepinscala

import java.util

object functionTest2 {
  // 详细的函数定义看插图.docx中的截图
  def max(x: Int, y: Int): Int={
    if(x>y){
      return x;
    }else{
      return y;
    }
  }

  /**
    *In the case of min, however, you may leave the result type off and the compiler
    *  will infer it Also, if a function consists of just one statement,
    *  you can optionally leave off the curly braces.
    *  Thus, you could alternatively write the min function like this:
    */
  def min(x: Int, y: Int)=if(x>y) x else  y

  /**
    * Here’s the definition of a function that takes
    * no parameters and returns no interesting result
    *
    *
    * Scala’s Unit type is similar to Java’s void type
    *
    * Methods with the result type of Unit, therefore, are only
    * executed for their side effects. In the case
    * of greet(), the side effect is a
    * friendly greeting printed to the standard output.
    */
  def greeting()=println("hello world")
  def main(args: Array[String]): Unit = {
    val maxValue=max(1,2);
    println(maxValue)
    println(greeting())

    var arr: Array[String]=Array("12","14","15");

    println(arr(0))
    println(arr(1))
    println(arr(2))
    println("=================================")
    var i=0;
    while(i<arr.length){
      println(arr(i))
      i+=1;
    }


    println("==========---------------")

//    arr.foreach((arg: String) => println(arg))

//    arr.foreach(println)
println("ewioiioiooi")
    for(arg <- arr)
      println(arg)

  }
}


