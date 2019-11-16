package com.eagle.workingwithlists

object HighOrderFunctionInListTest {

  def main(args: Array[String]): Unit = {
    val list=List("fruit","apple","juice","corn")
    val lengthList=list.map(item => item.length)
    val lengthList2=list.map(_.length)
    //每个元素倒叙显示
    val reverse=list.map(_.toList.reverse.mkString)
   val flatReverse= list.flatMap(_.toList.reverse)
//    println(lengthList)
//    println(lengthList2)
//    println(reverse)
//    println(flatReverse)
//    println(List range(1,1))
    //1<=j<i<5 下面的表达式从右边往左边看
    val list2=List range(1,5) flatMap(i => List range(1,i) map(j => (i,j)))

   println(for{
     i <- List.range(1,5)
     j <- List.range(1,i)
   } yield (i,j))
    println(list2)
    println()

  }

  //求1+2+3+...+100
 val listSum= List range(1,101)
  var sum=0
  listSum.foreach(sum+=_)
//  println(sum)
  //************************Filtering lists: filter, partition, find, takeWhile, dropWhile, and span
// val partitionList= List.range(1,10).partition(_ %2==0)
//  println(partitionList._1.foreach(println))


// val findValueNone= List range(1,6) find(_>7)
// val findValueSome= List range(1,6) find(_ %2==0)
//  println(findValueSome)
//必须是连续满足 如：weefe  后面紧跟着apple那么输出结果就是：List(weefe,apple)
  val takeWhileTest=List("weefe","salad","apple","banana","werrjuicee") takeWhile(_ .endsWith("e"))
val spanTest=  List("weefe","salad","apple","banana","werrjuicee").span(_.endsWith("e"))

  println(takeWhileTest)
  println(spanTest)
  //全部满足才会返回true
  val forAllTest=List("wee","eie","eioe").forall(_.endsWith("e"))
  println(forAllTest)
}
