package com.eagle.controlabstraction

/**
  * higher-order functions can help reduce code duplication as you implement an API.
  * Another important use of higher-order functions
  * is to put them in an API itself to make client code more concise.
  */
object HighOrderFunctionTest {
  //是否包含负数
  def containsNegative(nums:List[Int]):Boolean={
    var exists=false
    for(item <- nums){
      if(item<0){
        exists=true
      }
    }
    exists

  }

//这个exists就是高阶函数
  def contains(nums:List[Int]):Boolean= nums.exists(_ < 0)


  def main(args: Array[String]): Unit = {
    val existsNegative = containsNegative(List(1,-2,9))
    println(existsNegative)
    println(contains(List(1,2,3)))
  }
}
