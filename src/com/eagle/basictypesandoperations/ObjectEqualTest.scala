package com.eagle.basictypesandoperations

/**
  * scala 中的== 只比较内容是否相等
  * 如果比较地址是否相等用eq这个方法
  */
object ObjectEqualTest {

  def main(args: Array[String]): Unit = {
    println(null.==(List.apply(1,2,3)))
    println(List(2,3,4) ==null)
    //比较地址(ne)
    println(List(2,4,5) eq List(2,4,5))
    //比较内容(==)
    println(List(2,4,5) == List(2,4,5))


  }

}
