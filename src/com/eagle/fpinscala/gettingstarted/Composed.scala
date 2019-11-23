package com.eagle.fpinscala.gettingstarted

/**
  * 一个函数的输出作为另一个函数的输入
  * function composition, which feeds the output of one function in as the input to another function
  */
object Composed {
  def composed[A, B, C](f: B => C, g: A => B): A => C = {
    (a: A) => f(g(a))
  }

  def main(args: Array[String]): Unit = {
    val funs = new Function1[Int, Int] {
      override def apply(x: Int): Int = {
        x + 1
      }
    }

    val addThen = funs.andThen(x => x * 2)(3)
    //8
    val composed = funs.compose {
      x: Int => x * 2
    }(3) //7

    println(s"addThen=${addThen} composed=${composed}")

  }

}
