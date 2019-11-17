package com.eagle.traits.stackablemodifications

trait Filtering extends IntQueue {
  //这个abstract一定不能少
 abstract   override def put(x: Int): Unit = {
    if(x>0){
      super.put(x)
    }
  }
}
