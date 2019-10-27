package com.eagle.nextstepinscala

/**
  * This example illustrates one benefit of programming with fewer vars.
  * The refactored (more functional) code is clearer, more concise,
  * and less error-prone than the original (more imperative) code.
  * The reason Scala encourages a functional
  * style is that it can help you write more understandable, less error-prone code
  *
  *
  * ********************************************************
  * 对待函数式编程和命令式编程的正确态度是：
  * A balanced attitude for Scala programmers
  *
  * Prefer vals, immutable objects, and methods
  * without side effects. Reach for them first.
  * Use vars, mutable objects, and methods with
  * side effects when you have a specific need
  * and justification for them.
  *
  * *********************************************************
  *
  * @author qinlinsen
  */
object functionalStyleCompareImperativeStyleTest {
  /**
    * 第一种方式用imperative style
    * @param args
    */
  def printArgs(args: Array[String]):Unit={
    var i=0;
    while(i<args.length){
      println(args.apply(i))
      i=i+1
    }
  }
  //第二种方式用functional style
  def printArgsWithFunctionalStyle(args: Array[String]) :Unit={
    for(arg <- args){
      println(arg)
    }
  }

  def  printArgsWithFunctionalStyle2(args: Array[String]) :Unit={
    args.foreach(println)
  }

  def main(args: Array[String]): Unit = {
    printArgs(Array("a","b","c"))

    printArgsWithFunctionalStyle(Array("d","e","f"))
    printArgsWithFunctionalStyle2(Array("g","h","i"))
    println("---------------------------------------")
    //给Array数组的每一个元素加上一个分隔符 mkString 这个方法在Array , list  ,set , map 中都有
    Array("o","h","g").mkString("$$").foreach(print)
  }
}
