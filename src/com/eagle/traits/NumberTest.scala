package com.eagle.traits

class NumberTest(val x:Int,val y:Int) extends Play[Int]{
  override def play(one: Int, that: Int): Int = y-x
}
