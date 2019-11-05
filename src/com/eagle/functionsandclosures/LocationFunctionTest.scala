package com.eagle.functionsandclosures

import scala.io.Source

/**
  *函数式编程的一个重要思想是每一个函数定义成一个可以做一个具体事情的小任务。
  */
object LocationFunctionTest {
  def processFile(absolutePath:String):Unit={
    /**
      *这个是location function , 可以把location function 类比成一个函数里面的局部变量(location variable)
      * 包裹location function 的是  enclosing function,
      * enclosing function 是外层函数， location function 是内层函数。
      */
    def processLine(line:String): Unit= println(line)

    val lines=Source.fromFile(absolutePath).getLines()
    lines.foreach(line => processLine(line))

  }
  def main(args: Array[String]): Unit = {

  }
}
