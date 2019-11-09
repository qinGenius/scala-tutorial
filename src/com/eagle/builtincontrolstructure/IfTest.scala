package com.eagle.builtincontrolstructure

import java.util.Objects

object IfTest {
  /**
    * It tells readers of the code that the variable will never change, saving them from
    * scanning all code in the variable’s scope to see if it ever changes.
    * A second advantage to using a val instead of a var is that it better sup- ports equational reasoning.
    *
    *
    *
    * scala's if can result in value
    * @param s
    * @return
    */
  def ternaryOperator(s:String)=if (Objects.nonNull(s)) s else "空字符串"

  def main(args: Array[String]): Unit = {
    //val tell reader the variable can't change

    //Look for opportunities to use vals. They can make your code both easier
    // to read and easier to refactor.
    val empty=ternaryOperator(null)
    val people=ternaryOperator("人民")
    println(s"empty=${empty} people=${people}")
  }

}
