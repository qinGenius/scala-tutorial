package com.eagle.nextstepinscala.tuple

/**
  * tuple中可以包涵不同类型的对象，在java中返回多个对象时需要创建javaBean来封装对象
  * 但在scala中直接让其返回tuple就可以了
  *
  * tuple中的索引时从1开始计算的，跟数组不同（数组时从0开始的），这主要是为了跟其他也有
  * tuple的语言（如：Haskell,ML）保持一致
  *
  *
  *
  * @author qinlinsen
  */
object TupleTest {

  def main(args: Array[String]): Unit = {
    //显示声明tuple变量
    var tupleTest: Tuple2[String, Int] = ("12", 1);
    println(tupleTest.isInstanceOf[Tuple2[String, Int]])
    //隐式声明tuple变量
    var implicityTupleTest=(1,"2");

    //访问tuple中的第一个元素
    println("implicityTupleTest第一个元素的值是："+implicityTupleTest._1)
    //访问tuple中的第二个元素
    println("implicityTupleTest第二个元素的值是："+implicityTupleTest._2)

    /**
      * Accessing the elements of a tuple
      * You may be wondering why you can’t access the elements of a
      * tuple like the elements of a list, for example, with “pair(0)”. The reason
      * is that a list’s apply method always returns the same type,
      * but each element of a tuple may be a different type: _1 can have one result type,
      * _2 another, and so on. These _N numbers are one-based, instead of zero-based,
      * because starting with 1 is a tradition set by other languages with statically
      * typed tuples, such as Haskell and ML.
      *
      */
  }
}
