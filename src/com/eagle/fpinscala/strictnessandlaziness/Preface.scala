package com.eagle.fpinscala.strictnessandlaziness

object Preface {
  def if2[A](condition:Boolean,onTrue: => A ,onFalse: => A): Unit ={
    if (condition) onTrue else onFalse
  }

  def pair(i: => Int):(Int,Int)={
    lazy val j=i;
    (j,j)
  }
  def main(args: Array[String]): Unit = {
    val twentyOne = List(1,2,3,4,5).foldLeft(6)((x,y) => x+y)
    println(twentyOne)

   val another= List(1,2,3,4,5).foldRight(6)((x,y) => x+y)
    println(another)

    List(1,2,3,4,5).zip(List(6,7,8)).foreach(println(_))


    println("---------------------------------------------")

    val threeLessThanFive = if2(3>5,"3大于5","3小于5")
    println(threeLessThanFive)

    println("---------------------------------------------")
    pair({
      println("hello")
      1+12
    })
  }
}
