package com.eagle.traits.stackablemodifications

trait Incrementing extends IntQueue {
  //切记这个abstract一定不能少
 abstract override def put(x: Int): Unit = super.put(x+1)
}
