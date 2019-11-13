package com.eagle.leetcode.array

object AscendTest {
  def ascend(xs:List[Int]): List[Int] ={
    if(xs.isEmpty) Nil
    else insert(xs.head,ascend(xs.tail))
  }
  def insert(x:Int,xs:List[Int]):List[Int]={
    if(xs.isEmpty || x<=xs.head) x::xs
    else xs.head::insert(x,xs.tail)
  }
  def main(args: Array[String]): Unit = {
    ascend(7::9::2::1::0::5::Nil).foreach(println)
  }

}
