package com.eagle.fpinscala

/**
  * scala中的范型的上界和下界的定义
  * 上下界全部以T(target)作为参考点
  *S >: T  T 是S 的下界
  *
  *S <: T  T 是S的上界
  *
  *
  * **********************
  * 协变
  * 如果A 是B的子类，那么C[A]是C[B]的子类则称为协变    协变用+号表示
  *
  *
  * 逆变
  * 如果A 是B的子类，那么C[A]是C[B]的父类则称为逆变    逆变用-号表示
  *
  */
object GenericTypeTest {
  def order[T <: Comparable[T]] (one: T,other:T): Int ={
    one.compareTo(other)
  }
  def main(args: Array[String]): Unit = {
    val i = order(new Integer(1),new Integer(6))
    println(i)
  }

}
