package com.eagle.fpinscala.whatisfunctionalprogramming.game

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

//    players.reduceLeft()
  }
}