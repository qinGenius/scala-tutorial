package com.eagle.fpinscala.gettingstarted

/**
lessThan has type Function2[Int,Int,Boolean], which is usually written (Int,Int) => Boolean.
Note that the Function2 interface (known in Scala as a "trait") has a single method called apply .
And when we call the lessThan function with lessThan(10, 20),
it is really syntax sugar for calling its apply method:
Function2 is just an ordinary trait (i.e. an interface) provided by the standard Scala library
(API docs link) to represent function objects that take two arguments.
Also provided are Function1, Function3, and others,
taking a number of arguments indicated by the name.
Because functions are really just ordinary Scala objects,
we say that they are first-class values. We will often use "function"
to refer to either such a first-class function or a method, depending on context.
  */
object IllustrateFunction {
  val lessThan=(a:Int,b:Int)=> a<b

  val greaterThan=new Function2[Int,Int,Boolean] {
    override def apply(v1: Int, v2: Int): Boolean = v1>v2
  }

  def main(args: Array[String]): Unit = {


    println(lessThan(10,19))

    println(greaterThan(10,19))
    println(greaterThan.apply(10,19))
  }
}
