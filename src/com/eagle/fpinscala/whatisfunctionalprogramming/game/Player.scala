package com.eagle.fpinscala.whatisfunctionalprogramming.game

/**
  * 有关scala中类的说明：
  * 1.类的构造方法的参数如果前面有val 修饰相当于提供了getter方法，如果用var修饰相当于提供了setter 和getter方法，
  * 如果既没有var 又没有val，则说明没有提供setter和getter方法，这样的属性，在外部是无法引用的
  */
class Player( val name:String, val score:Double){

}
