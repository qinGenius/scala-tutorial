package com.eagle.functionalobjects

/**
  * 在scala中类可以带参数，类中带的参数scala编译器会自动生成一个带同样参数的构造方法
  * @param numerator
  * @param denominator
  */
class Rational(numerator:Int,denominator:Int) {
  //  println(s"numerator=${numerator}/n denominator= ${denominator}")
  /**
    * 重写java.lang.Object类中的toString方法
    * @return
    */
  override def toString:String=numerator+"/"+denominator

}
