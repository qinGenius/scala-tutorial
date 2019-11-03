package com.eagle.basictypesandoperations

/**
  * scala中的operator有三种分别是： infix postfix prefix
  */
object OperatorTest {

  def main(args: Array[String]): Unit = {
    println(s"1+2=${1+2}")
    println(s"1+2=${1.+(2)}")

    println("--------------------------------------------------------")
    //这个例子说明操作符不要局限于+ - * / 这个operator 可以指代一切,一切方法都可以作为operator
    println(s"hello 中l第一次出现的位置是：${"hello" indexOf 'l' }")
    println(s"hello 中l第一次出现的位置是：${"hello".indexOf('l')}")

    println("---------------------------------------------------------")
    println(s"hello 中l最后一次出现的位置是：${"hello" lastIndexOf 'l'}")

    println(s"hello从index=2开始第一次l出现的位置是：${"hello" indexOf ('l',3)}")


    //下面这个是自定义的operator IncrementOne
   val oneAndOne= OperatorTest incrementOne 1
    println(oneAndOne)
    //这个是prefix operator
    println(s"-7=${7.unary_-}")

    /**
      * Postfix operators are methods that take no arguments,
      * when they are in- voked without a dot or parentheses.
      * In Scala, you can leave off empty paren- theses on method calls.
      */
    //当一个方法中没有任何参数或者只有一个参数时这时小括号可以省略
    println("hello".toLowerCase)

    println(0 max 5)

    println(s"0与5比较谁小:${0 min 5}")
  }

  def add(a:Int,b:Int):Int=a+b

  def incrementOne(a:Int)=add(a,1);
}
