package com.eagle.workingwithlists

/**
  * Folding lists: /: and :\
  */
object FoldingListOperationTest {
  def sum(xs: List[Int]): Int = (0 /: xs) (_ + _)

  def concatenate(words:List[String]):String=(words.head /: words.tail) (_ +"&&"+ _)
  def product(xs:List[Int]):Int=(1 /: xs) (_ * _)
  //xs :\ 0 左边是list ,右边是初始值
  def sumFoldRight(xs:List[Int]):Int=(xs :\ 0) (_ + _)

  def reverseLeft[T](xs: List[T]) =
    (List[T]() /: xs) {(ys, y) => y :: ys}
    //等价于List[Int]().appended(3).appended(2).appended(1))
  def reverseLeft2[T](xs:List[T]):List[T]=(xs :\ List[T]()) {(y,ys)=> ys.appended(y)}


  def main(args: Array[String]): Unit = {
    println(sum(List range(1,5)))
    println(product(List range(1,5)))
    println(sumFoldRight(List range(1,5)))
    println(concatenate(List("apple","banana","juice")))


   val result=reverseLeft2(List(1,2,3))

    println(result)
    println(List[Int]().appended(3).appended(2).appended(1))

    val sorted=List(1,5,3).sortWith(_<_)
    println(sorted)

    //*****************************Creating uniform lists: List.fill
    //this is currying
//    println(List.fill(5)("h"))
//    println(List.fill(10,2)("h"))
//    println(List.tabulate(5)(n => n+2))

//    println(List.concat(List(1,2),List(3)))
    //***********processing multiple list together

    println((List(1,3,5),List(4,5,6)).zipped.forall(_ > _))
    println((List("a","b","c"),List(1,2,3)).zipped.map(_ .appended(_).toString()))

    println();
  }
}
