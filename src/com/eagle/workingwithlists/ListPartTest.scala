package com.eagle.workingwithlists

object ListPartTest {
  def consistsOfList(): List[Int] ={
    //从这里可以看出list是由两部分组成：Nil  and ::
    val Listone:List[Int]=1::2::3::4::Nil
    val ListTwo:List[Int]=Nil.::(4).::(3).::(2).::(1);
    Listone.foreach(println)
    println("____________________")
    Listone.foreach(println)
    println("____________________")
    return Listone;
  }
  def main(args: Array[String]): Unit = {
    consistsOfList();
  }

}
