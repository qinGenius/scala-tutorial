package com.eagle.workingwithlists

object ReverseTest {
  def reverse[T](xs:List[T]):List[T]=
   xs match{
    case List() => xs
    case x::xs1 => reverse(xs1) ::: List(x)
  }
  def main(args: Array[String]): Unit = {
    reverse(List(1,2,3)).foreach(println)
  }

}
