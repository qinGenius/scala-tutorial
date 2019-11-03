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
    val invalidRational=new Rational(1,1);
    println(invalidRational)

    println(new Rational(1,2).+(new Rational(2,4)))
    println(new Rational(1,2) + new Rational(2,4))

    println(new Rational(2,3)- new Rational(1,3))

    println(new Rational(2,3) min new Rational(1,3))
    println(new Rational(2,3) max new Rational(1,3))

    //invoke auxiliary  constructor:
    println(3,1)

    println(6.%(2))
    val oneFourth=new Rational(1,4)
    println(oneFourth.greatestCommonDivisor(8,12))

  }

}
