package com.eagle.workingwithlists

object DivideConquerTest {

  def append[T](xs:List[T],ys:List[T]):List[T]={
    xs match{
      case List() => ys
      case x::xs1 => x::append(xs1,ys)
    }
  }

  def main(args: Array[String]): Unit = {
    append(List(1,2,3),List(4,5,6)).foreach(println)

  }

}
