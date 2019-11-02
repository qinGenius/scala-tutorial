package com.eagle.classesandobjects

/**
  * 可以看到当一个standalone object 继承 App这个trait时
  * 直接在下面写语句就可以运行
  * 而不需要在main 方法里面写。
  *
  * 并且一个standalone object 继承App这个trait时，写main 方法会报错：Method main cannot override final
  * member
  */
object AppTraitTest extends App {
  for(num <- List(1,2,3)){
    println(num)
  }
  println(5)

}
