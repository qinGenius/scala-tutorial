package com.eagle.workingwithlists

/**
  * head returns the first element of a list
  * tail returns a list consisting of all elements except the first isEmpty
  * isEmpty returns true if the list is empty
  */
object BasicOperationOnListTest {

  def main(args: Array[String]): Unit = {
//    val list=1::2::3::4::5::6::Nil;
//    val firstElment=list.head
//    val lastElement=list.last
//    val init=list.init//除掉最后一个元素的list
//    val tail=list.tail;
//    println(s"该list是否为空,${list.isEmpty}")
//    println(s"firstElement=${firstElment}")
//    println(s"tail=${tail}")
//
//    println(s"lastElement=${lastElement}")
//    println(s"${init}")

    //******************take drop splitAt operation**********************
//    val firstTwo=List(1,2,3) take 2
//    println(firstTwo)
//    println(List(1,2,3) drop 1)
//
//    println(List(1,2,3) splitAt 1)
    //***************Element selection: apply and indices******************

//    println(list apply 1)
    //调用没有参数的方法时，必须用对象.方法名的方式， 其中.不能省略
//    println(list.indices)
    //*******************flatten

//    println(List(List(1,2,3),List(4,5,6)).flatten)

//    println(List("apple","banana","salad").map(_.toCharArray).flatten)

//    println(List("a","b","c") zip List(1,2,3))
//    println(List("a","b","c") zip List(1,2,3).unzip)
//    val zipped=List("a","b","c") zip List(1,2,3)
//    println(zipped.unzip)

    //****************toString mkString addString*****************
//    println(List(1,2,3).toString)
//
//    println(List(1,2,3) mkString "&")
//    println(List(1,2,3).mkString("a","||","b"))
//    println(List(1,2,3).mkString)
//    val builder = new StringBuilder
//    println(List(1,2,3).addString(builder,"$$"))
//    println(builder)

    //******************Converting lists: iterator, toArray, copyToArray**************
    val list=List(1,2,3)
    //list.iterator.foreach(println)
//    list.toArray.foreach(println)

//    list.toList.foreach(println)
    val arr=new Array[Int](9)
    val result=list.copyToArray(arr,2)
    arr.foreach(println)
  }
}
