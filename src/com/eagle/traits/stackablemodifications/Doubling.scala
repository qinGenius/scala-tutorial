package com.eagle.traits.stackablemodifications

/**
  * 这个trait有两个地方要注意：
  * 1.继承了IntQueue,这个说明这个trait只能作为也继承IntQueue的类一起使用 如：BasicIntQueue with Doubling
  * 2.super 调用了父类的方法
  */
trait Doubling extends IntQueue {
  //这个方法前面必须带abstract
 abstract override def put(x: Int): Unit = super.put(2*x)
}
