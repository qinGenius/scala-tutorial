package com.eagle.fpinscala.handlingerrorwithoutexceptions

object OptionalTest{
  def main(args: Array[String]): Unit = {
    val tom = new Student("1","tom")
    val daXiong = new Student("2","daXiong")
    List(tom,daXiong).map(_.age).foreach(println(_))
    println("---------------------------------------")
    List(tom,daXiong).map(_.name).foreach(println(_))

    val map = List(tom,daXiong).map(x => (x.age,x.name)).toMap
    println(map)

    println(math.pow(2,4))
  }
}
