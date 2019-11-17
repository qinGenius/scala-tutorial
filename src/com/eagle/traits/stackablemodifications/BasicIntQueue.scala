package com.eagle.traits.stackablemodifications

import scala.collection.mutable.ArrayBuffer

class BasicIntQueue extends IntQueue {
  private val buf=new ArrayBuffer[Int]()
  override def put(x: Int) = buf+=x

  override def get(): Int = buf remove 0
}
