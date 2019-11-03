package com.eagle.functionalobjects

object RationalNumberTest {

  def main(args: Array[String]): Unit = {
    /**
      * Given this code, the Scala compiler would place the call to println into
      * Rational’s primary constructor. The println call will, therefore,
      * print its debug message whenever you create a new Rational instance:
      */
    val oneHalf=new Rational(1,2)
    println(oneHalf)
  }

}
