package com.eagle.functionsandclosures

object PlaceholderTest {

  def main(args: Array[String]): Unit = {
    //function literal 的placeholder 用underscore（_）表示
    /**To make a function literal even more concise,
      *  you can use underscores as placeholders for one or more parameters,
      * so long as each parameter appears only one time within the function literal.
      *
      *  Multiple underscores mean multiple pa- rameters,
      *  not reuse of a single parameter repeatedly.
      *  The first underscore represents the first parameter,
      *  the second underscore the second parameter,
      *  the third underscore the third parameter, and so on.
      */
    List(-10,-9, -8, -7 ,0,1,2,3).filterNot(_ > 0).foreach(println)


    def sum (a:Int,b:Int,c:Int):Int=a+b+c
    val total=sum _
    val part=sum(1,_: Int,3)
    println(total(1,2,3))
    println(total.apply(1,2,3))
    //partially applied function
    //part(12)等价于part.apply(16)
    println(part(12))//16

    println(part.apply(12))


  }
}
