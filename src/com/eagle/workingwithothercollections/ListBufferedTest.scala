package com.eagle.workingwithothercollections

import scala.collection.mutable.ListBuffer

object ListBufferedTest {


  def main(args: Array[String]): Unit = {
//    val listBuffer=new ListBuffer[Int]()  这个（）可以省略
    val listBuffer=new ListBuffer[Int]
    listBuffer+=1
    listBuffer += 2
    listBuffer += 3
    listBuffer.toList.foreach(println)
  }


}
