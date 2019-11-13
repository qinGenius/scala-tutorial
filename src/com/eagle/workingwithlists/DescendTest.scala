package com.eagle.workingwithlists

object DescendTest {
  private def insert(x:Int,xs:List[Int]):List[Int]={
//    if(xs.isEmpty || x>=xs.head) x::xs
    if(xs.isEmpty || x>=xs.head) x::xs
    else xs.head::insert(x,xs.tail)
  }

  def sort(xs:List[Int]):List[Int]={
    if (xs.isEmpty) Nil
    else insert(xs.head,sort(xs.tail))
  }
  def main(args: Array[String]): Unit = {
    sort(List(4,8,2,13,9)).foreach(println)
  }
}
