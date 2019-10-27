package com.eagle.nextstepinscala.list

object ListTest {

  def main(args: Array[String]): Unit = {
    //scala中的list的元素都是不可变的(immutable)
    //一次性给list赋多个值
   var list : List[Int]= List.apply(1,2,3);
    //遍历list
    list.foreach(println)
    println("---------------------------------------")
    //第二种方法用隐式的形式一次性赋多个值：
   var secondList= List(4,5,5);
    secondList.foreach(println)

    println("-----------------------------------------")

    /**
      * 这里测试  List中的方法:::的用法
      */

    //第一种直接调用List中的:::方法
    var oneList=List("a","b","c")
    var otherList=List("c","d","e","f")
    oneList.:::(otherList).foreach(println)
    println("---------------------------------")
    //第二种方式隐式调用,隐式调用:::这个方法名好像一个操作符号，
    //这种情况下可以把scala中的+ - * / 这四个方法和:::这个方法放在一起思考进行类比。

    //两者的不同点是:::方法名是以冒号(colon)结束的，而+ - * / 不是以冒号结束的
    //以冒号结束的是right operator ,right operator是位于操作符右边的调用左边的
    //而+ - * /是left operator  , left operator 是位于操作符左边的调用右边的
    //所以a + b   等价于     a .+(b)
    //oneList:::otherList 等价于otherList. :::(oneList);
    val resultList=otherList:::oneList
    resultList.foreach(println)

    /**
      * 这里测试List中的方法::的用法
      */
    println("------------------------")
    var aList=oneList::otherList
    println(aList)
    println("------------------------")
    var bList=oneList.::(otherList)
    println(bList)
    println("--------------------------")

    /**
      * reverse_:::这个方法的用法
      */
    var cList=oneList reverse_::: otherList
    cList.foreach(println)

    /**
      * 链式调用
      */
    println("----------------------------------------")
    var dList=List(1,2,3) reverse_::: List(4,5,6);//3,2,1,4,5,6

    dList.foreach(println)

    println("------------------------");
   var eList= Nil:::List(1,3,5)//1,3,5

   eList.foreach(println)
  }
}
