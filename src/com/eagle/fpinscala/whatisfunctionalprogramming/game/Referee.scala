package com.eagle.fpinscala.whatisfunctionalprogramming.game

import com.eagle.fpinscala.gettingstarted.MyModule

object Referee {
  //pure function
  def win(one:Player,other:Player): Player ={
    require(one!=null,"one is require not null")
    require(other!=null,"one is require not null")
    if(one.score >= other.score) one else other
  }

  def declareWinner(one:Player,other:Player): Unit ={
    val result = win(one, other);
    println(s"the winner is [${result.name}]")
  }

  def max(a:Int,b:Int):Int={
    if (a>b) a else  b
  }
  def main(args: Array[String]): Unit = {
    val song = new Player("宋仁宗", 12.3)
    val tang = new Player("唐太宗", 14.5)
    for (i <- 0 until 10) {
      declareWinner(song,tang)
    }
    println("--------------------------------------------")
   val players= List(new Player("张三",12),
      new Player("李明",10),
      new Player("赵四",18))

    val count=List(1,3,5,9).reduceLeft((x,y )=> x-y)
    println(count)

    println("---------------------------------------------  ")
    val maxNumber=List(9,8,1,10,11,11).reduceRight((x,y) => max(x,y))
    println(maxNumber)

   val minusNineAbsoluteValue= MyModule abs -9
    println(minusNineAbsoluteValue)

  }
}
