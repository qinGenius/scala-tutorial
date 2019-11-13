package com.eagle.workingwithlists

/**
  * head returns the first element of a list
  * tail returns a list consisting of all elements except the first isEmpty
  * isEmpty returns true if the list is empty
  */
object BasicOperationOnListTest {

  def main(args: Array[String]): Unit = {
    val list=1::2::3::4::5::6::Nil;
    val firstElment=list.head
    val tail=list.tail;
    println(s"该list是否为空,${list.isEmpty}")
    println(s"firstElement=${firstElment}")
    println(s"tail=${tail}")
  }
}
