package com.eagle.fpinscala.datastructure

/**
  * Footnote We could call x and xs anything there, but it is a common convention to use xs, ys, as, bs
  * as variable names for a sequence of some sort, and x, y, z, a,
  * or b as the name for a single element of a sequence.
  * Another common naming convention
  * is h for the first element of a list (the "head" of the list),
  * t for the remaining elements (the "tail"), and l for an entire list.
  */
object ListTest extends List[Int] {


  def main(args: Array[String]): Unit = {


    val i = List.sum(List(2,3))
    println(i)

    val result = List.apply(1,3,4)

    println(result)

  }

}
