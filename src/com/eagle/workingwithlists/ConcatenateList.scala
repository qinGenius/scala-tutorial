package com.eagle.workingwithlists

object ConcatenateList {

  def main(args: Array[String]): Unit = {
    //:::是2个list相拼接的方法
   val y= 1::2::3::4::Nil ::: 5::6::7::8::9::Nil
    y.foreach(println)
    println("---------------------")
    val z=List(5,6,77,8,9).:::(List(1,2,3,4));
    z.foreach(println)
  }
}
