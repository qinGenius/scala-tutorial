package com.eagle.workingwithothercollections

object ArrayTest {

  def main(args: Array[String]): Unit = {
    val arr=Array(1,3,5)
    println(arr(2))

    val arr1=new Array[String](5);
    arr1(2)="a"
    arr1(3)="b"
    arr1(4)="c"
    println(arr1.foreach(println))
  }

}
