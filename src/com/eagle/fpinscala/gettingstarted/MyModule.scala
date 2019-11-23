package com.eagle.fpinscala.gettingstarted

/**
  * We can bring all of an object's (non-private) members into scope by using the underscore syntax:
  * import MyModule._
  */
object MyModule {
  //这个返回值前面的colon(:)读has type
  //等号左边的称为函数的签名(signature)或者left-hand side
  def abs(a:Int):Int={
    if (a<0) -a else  a
  }

  /**
    *The body of the method itself comes after an equals (=) sign.
    * We will sometimes refer to the part of a method
    * declaration that goes before the equals sign as the left-hand side or signature,
    * and the code that comes after the equals sign we will sometimes refer to as the right-hand side
    * or definition. Note the absence of an explicit return keyword.
    *  The value returned from a method is simply the value of its right-hand side.
    */
  def formatAbs(a:Int):String={
    val msg="the absolute value of %d is %d"
    msg.format(a,abs(a))
  }

  /**
    *
    * @param s
    * @param n
    * @param f  函数式编程语言定义函数常用f g h 等一些数学中常常使用的函数名
    * @return
    */
  def formatResult(s:String,n:Int,f:Int => Int):String={
    val msg="the %s of %d is %d"
    msg.format(s,n,f(n))
  }

  /**
    * usually a return type of Unit is a hint that the method has a side effect.
    */

  def main(args: Array[String]): Unit = {
    val result = formatAbs(-9)

    println(result)
    //从这里可以看出函数名是函数的引用
    val result2=formatResult("absolute value",-10,abs)
    println(result2)
  }
}
