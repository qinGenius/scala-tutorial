package com.eagle.functionalobjects

/**
  *scala中的构造方法有primary constructor 和auxiliary constructor 两种
  * 这里的分数假设都是非负数
  * 在scala中类可以带参数，类中带的参数scala编译器会自动生成一个带同样参数的构造方法
  * @param numerator
  * @param denominator
  */
class Rational(numerator:Int,denominator:Int) {
  //  println(s"numerator=${numerator}/n denominator= ${denominator}")
  //add fields
  val g=greatestCommonDivisor(numerator,denominator);
  //分子分母都除以最大公约数
  val n=numerator/g
  val d=denominator/g
  /**
    * 重写java.lang.Object类中的toString方法
    * @return
    */

  //define auxiliary constructor
  /**
    * In Scala, every auxiliary constructor must invoke
    * another constructor of the same class as its first action
    */
  def this(numerator:Int)=this(numerator,1)
  //precondition
  //检验参数是否合法：可以用Predef中的require方法
  //A precondition is a con- straint on values passed into
  // a method or constructor, a requirement which callers must fulfill.
  require(denominator !=0,"denominator cannot equal to zero")
  override def toString:String=n+"/"+d
  //两个分数相加
  def +(that:Rational):Rational=new Rational(n*that.d+that.n*d,d*that.d)
  //两个分数相减
  def -(that:Rational):Rational=new Rational(n*that.d - that.n*d,d*that.d)

  def <(that:Rational):Boolean=n*that.d - that.n*d<0

  def >(that:Rational):Boolean=n*that.d - that.n*d>0
  def >=(that:Rational):Boolean=n*that.d - that.n*d>=0
  def <=(that:Rational):Boolean=n*that.d - that.n*d<=0

  def max(that:Rational):Rational=if (>=(that)) this else that

  def min(that:Rational):Rational=if(<=(that)) this else that


   def greatestCommonDivisor(a:Int,b:Int):Int=if (b==0) a else greatestCommonDivisor(b,a%b)


}
