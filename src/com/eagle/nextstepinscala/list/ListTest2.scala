package com.eagle.nextstepinscala.list

object ListTest2 {

  def main(args: Array[String]): Unit = {
    //List api 的基本用法
    val thrill="will"::"fill"::"until"::Nil;

    //取出thrill中的第二个元素：
    println(thrill.apply(1))
    //或者这样写：
    println(thrill(1))
    println("------------------------------")
    //得到thrill除去最后一个元素的新的List
    thrill.init.foreach(println)
    println("-----------------------")
    //取出thrill中除去第一个元素的新的List
    thrill.tail.foreach(println)
    println("-----------------------")
    //在thrill只保留长度为4的字符串
    thrill.filter(element => element.length==4).foreach(println)
    println("-----------------------")
    //在thrill中统计长度为4的字符串的个数
    println(thrill.count(element => element.length==4))
   // 判断thrill中是否含有until
    println("-----------------------")
    println(thrill.exists(element => element=="unil"))
    //判断thrill中所有字符串中是有都含有字母L
    println("-----------------------")

    thrill.forall(element => element.contains("l"))
    //在thrill中只保留那些字符串的长度不等于4的字符串
    println(thrill.filterNot(element => element.length==4))
  }
}
