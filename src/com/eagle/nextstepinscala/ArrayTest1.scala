package com.eagle.nextstepinscala

object ArrayTest1 {

  def main(args: Array[String]): Unit = {
    //define a array
    val arr: Array[String]=new Array[String](4);
    //initialization
    arr(0)="1"
    arr(1)="2"
    arr(2)="3"
    arr(3)="4"
    //遍历数组的几种方式

    println("方式1用imperative style的方式")
    var i:Int=0;
    while (i<arr.length){
      println(arr(i))
      i+=1;
    }

    println("方式二用forEach function style")

    arr.foreach(println)
    println("方式3 用for in的形式，在scala 中 <- 这个向左的箭头可以看成in ")

    for(element <- arr){
      println(element)
    }

    println("第四种方式用lambda表达式的方式")

    arr.foreach((a: String)=> println(a)) //也可以简写成：arr.foreach(a=> println(a))
  }
}
