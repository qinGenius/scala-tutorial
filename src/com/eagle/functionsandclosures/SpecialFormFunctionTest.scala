package com.eagle.functionsandclosures

object SpecialFormFunctionTest {
  //repeatable parameters 相当于java中的 ...
  def echo(args:String*):Unit=args.foreach(println)
  //named parameter
  def speed(distance:Int,time:Int):Int=distance/time
  //default parameter
  def speed2(distance:Int = 30,time:Int =2):Int=distance/time
  def speed3(distance:Int = 30,time:Int):Int=distance/time
  def main(args: Array[String]): Unit = {
    echo("a","b","c")
    val arr=Array("d","e","f")
    //String* 其实就是一个Array[String]类型,直接传递这个数组会报错，所以需要在arr 后添加冒号（：）以及 _*才可以
//    echo(arr)  //直接传递arr报错
    echo(arr: _*)

    //invoke speed function with named parameter
   val sp= speed(time= 20,distance = 100)

    println(sp)
    println(speed2())
    println(speed3(time = 2))

  }
}
