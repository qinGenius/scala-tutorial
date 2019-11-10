package com.eagle.controlabstraction

object ByNameParameterTest {
  def myAssert(predicate:Boolean)={
    if(!predicate)
      throw new AssertionError
  }

  def myAssert(predicate:()=>Boolean)={
    if(!predicate()){
      throw new AssertionError
    }
  }

  def byNameAssert(predicate: => Boolean)={
    if(!predicate){
      throw new AssertionError
    }
  }

  def main(args: Array[String]): Unit = {
//    myAssert(5<3)
//    myAssert(()=>5<3)
    byNameAssert(5<3)
  }
}
