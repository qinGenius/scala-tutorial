package com.eagle.workingwithothercollections

object ConvertTest {

  def main(args: Array[String]): Unit = {
    val immutableMap=Map.empty++scala.collection.mutable.Map("1" ->1)

    val mutableMap=scala.collection.mutable.Map.empty++Map("i" -> 1)

    val immutableSet=Set.empty ++ scala.collection.mutable.Set(1,3,4)
    val mutableSet=scala.collection.mutable.Set.empty ++ Set.empty

  }

}
