package com.eagle.traits

/**
  * Mixing in multiple traits.
  * 其实这个with 跟java中的Implement类似
  */
class Frog extends Animal with Philosophical with HasLegs {
  override def toString: String = "green"

  override def philosophize(): Unit = super.philosophize()

  override def hasLeg(): Unit =  println("frog has four legs")

  override def eat(): Unit = println("almost animal eat food")

}
