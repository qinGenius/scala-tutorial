package com.eagle.fpinscala.gettingstarted

object Currying {
  /**
    * A => B => C 跟A => (B => C) 写法完全等价
    * Let's look at another example, currying, which converts a function of N arguments into
    * a function of one argument that returns another function as its result   Here again,
    * there is only one implementation that typechecks.
    */
  def currying[A,B,C](f:(A,B) => C): A => B => C={
    a => b => f(a,b)
  }

  def uncurrying[A,B,C](f: A => B => C):(A,B) => C={
    (a:A,b: B) =>  f(a)(b)
  }
  def main(args: Array[String]): Unit = {
    currying((x:Int,y:Int) => x+y)
  }
}
