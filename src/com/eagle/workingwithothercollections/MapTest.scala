package com.eagle.workingwithothercollections

object MapTest {
  def main(args: Array[String]): Unit = {
    val nums=Map("i" -> 1,"j" ->1)
    val nums2=nums + ("k" -> 3)
   val num3= nums2+ ("h"  -> 4)
    val num4=num3+("re"->5)
    println(nums2)
    println(num3)
    println(num4)
    val num5=num4.removed("i")
    println(num5)
  }
}
