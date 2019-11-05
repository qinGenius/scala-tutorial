package com.eagle.functionsandclosures

/**
  *A function literal is compiled into a class that when instantiated at run- time
  * is a function value.
  * Thus the distinction between function literals and values
  * is that function literals exist in the source code,
  * whereas function val- ues exist as objects at runtime.
  * The distinction is much like that between classes (source code) and objects (runtime)
  *
  *
  *
  *
  *
  *
  * Every function value is an instance of some
  * class that extends one of several FunctionN traits in package scala,
  * such as Function0 for functions with no parameters, Function1 for functions with one parameter,
  * and so on. Each FunctionN trait has an apply method used to invoke the function.
  */
object FunctionLiteralTest {
  //等号右边就是一个function literal，左边是一个function value
  var increase=(x:Int) => x+1
  def main(args: Array[String]): Unit = {
    val result=increase(3)
    println(result)
    println("====================================================")
    //list 中每个元素双倍输出


    /**
      * short forms of function literals
      * 从下面两个方面：
      * 1.leave out parameter type
      * 2.省略参数的括号
      * 下面3个语句一个比一个要简洁
      */
    List(1,2,3,4,5,6,7).map((element :Int) => element * 2).foreach(println)
    List(1,2,3,4,5,6,7).map((element) => element * 2).foreach(println)
    List(1,2,3,4,5,6,7).map(element => element * 2).foreach(println)
  }
}
