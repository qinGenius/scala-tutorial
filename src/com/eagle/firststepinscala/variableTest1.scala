package com.eagle.firststepinscala

object variableTest1 {
  def main(args: Array[String]): Unit = {
    //用val 修饰的变量不可以重新赋值,否则会报 reassignment to val
    //scala compiler can infer that msg's type is String
    //等价于val msg : String = "hello world"
    val msg  = "hello world"
//    msg="34"
    println(msg)
    //返回结果为ture
    println(msg.isInstanceOf[String])

    //如果你想把一个变量重新赋值的话，可以用var进行修饰

    var helloworld = "你好世界"

    helloworld="世界你好"
    println(helloworld)

  }
}
