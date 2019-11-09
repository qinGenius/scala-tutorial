package com.eagle.functionsandclosures

/**
  * The function value (the object) that’s created at runtime from this function
  * literal is called a closure.
  *
  * 在运行时根据此函数文字创建的函数值（对象）称为闭包。
  */
object ClosureTest {

  def main(args: Array[String]): Unit = {
    var more:Int=3;
    more=34
    //this is a closure that a function literal with free variable
    val addMore=(x:Int) => x+more;

    println(addMore.apply(4))
    println(addMore(4))

    //利用closure 计算1+2+3+.....+10
    var sum=0
    var i=0;
    val list=List(1,2,3,4,5,6,7,8,9,10)
    //这个sum是free variable
    list.foreach(sum += _)

    println(s"sum=${sum}")

    /**
      * When you call makeIncreaser(1),
      * a closure is created and returned that captures the value 1 as the binding for more.
      */

    def makeIncrement(more:Int) = (x:Int) => x+more

    val r=makeIncrement(5).apply(1)
    println(r)


  }

}
