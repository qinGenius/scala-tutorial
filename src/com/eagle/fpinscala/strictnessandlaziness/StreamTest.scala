package com.eagle.fpinscala.strictnessandlaziness

object StreamTest {
  def main(args: Array[String]): Unit = {
    val start=System.currentTimeMillis()
    List(1,2,3,4,5,6,7) filter(_ %2 !=0) map(_ +2) foreach(println(_))
    val end=System.currentTimeMillis()
    println(s"----------elapsed time =${end-start}")
  }
}
