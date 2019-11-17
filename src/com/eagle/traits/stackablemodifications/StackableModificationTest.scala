package com.eagle.traits.stackablemodifications

object StackableModificationTest {
  def main(args: Array[String]): Unit = {
    val queue = new BasicIntQueue
    queue.put(1)
    queue.put(2)
    val i = queue.get()
    println(i)

    println("_____________________________________________")
    val myQueue = new MyQueue
    myQueue.put(10)
    println(myQueue.get())

    println("_____________________________________________")

    val increment = new MyQueueOfIncrement
    increment.put(1)
    println(increment.get())

    println("_____________________________________________")

    val filtering = new MyQueueOfFiltering
    filtering.put(-1)
    filtering.put(-2)
    filtering.put(9)
    println(filtering.get())

    println("_____________________________________________")
//计算stackable modifications 的trait的优先级是从右边到左边
    val queueWithTraits2 = new BasicIntQueue with Incrementing with Doubling
    queueWithTraits2.put(1)//1*2+1
    queueWithTraits2.put(2)//2*2+1
    queueWithTraits2.put(3)//3*2+1
    for(i <- 0 to 2){
      println(queueWithTraits2.get())
    }


    println("_____________________________________________")
    //计算stackable modifications 的trait的优先级是从右边到左边
    val queueWithTraits3 = new BasicIntQueue  with Doubling with Incrementing
    queueWithTraits3.put(1)//(1+1) *2
    queueWithTraits3.put(2)//(2+1) *2
    queueWithTraits3.put(3)//(3+1) *2
    for(i <- 0 to 2){
      println(queueWithTraits3.get())
    }


  }

}
