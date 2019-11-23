package com.eagle.fpinscala.gettingstarted

/**
  * polymorphic function 就是带有 type parameter的函数
  *
  *
  * Boxed types and specialization in Scala
  * A function that is polymorphic in some type is generally
  * forced to represent values of these types as boxed, or non-primitive values,
  * meaning they are stored as a pointer to a value on the heap.
  * It is possible to instruct the Scala compiler to produce specialized versions of a
  * function for each of the primitive types, just by adding an annotation to that type parameter:
  * This can potentially be much more efficient, though the mechanism is rather fragile,
  * since the polymorphic values will get boxed as soon as
  * they are passed to any other polymorphic function or data type which is
  * unspecialized in this way.
  */
object PolymorphicFunction {
  def specializable[A](arr:A):A={
    arr
  }
  def main(args: Array[String]): Unit = {
    val result = specializable(12)
    println(result.isInstanceOf[Int])
  }

}
