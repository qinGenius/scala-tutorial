package com.eagle.workingwithothercollections

import scala.collection.mutable.ArrayBuffer

object ArrayBufferTest {
  def main(args: Array[String]): Unit = {
    val arr = new ArrayBuffer[Int]()
    arr += 5
    arr += 6
    arr +=9
    arr.toList.foreach(println)
  }
}
