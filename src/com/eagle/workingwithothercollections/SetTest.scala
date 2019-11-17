package com.eagle.workingwithothercollections

/**
  * Table 17.1 · Common operations for sets
  * What it is
  * val nums = Set(1, 2, 3)
  * nums + 5
  * nums - 3
  * nums ++ List(5, 6)
  * nums -- List(1, 2)
  * nums & Set(1, 3, 5, 7)
  * What it does
  * Creates an immutable set (nums.toString returns Set(1, 2, 3))
  * Adds an element (returns Set(1, 2, 3, 5))
  * Removes an element (returns Set(1, 2)) Adds multiple elements (returns
  * Set(1, 2, 3, 5, 6))
  * Removes multiple elements (returns
  * Set(3))
  * Takes the intersection of two sets (returns
  * Set(1, 3))
  * Returns the size of the set (returns 3)
  * Checks for inclusion (returns true)
  * Makes the mutable collections easy to access
  * Creates an empty, mutable set (words.toString returns Set())
  * Adds an element (words.toString returns Set(the))
  * Removes an element, if it exists (words.toString returns Set())
  * Adds multiple elements (words.toString returns Set(do, re, mi))
  * Removes multiple elements (words.toString returns Set(mi))
  * Removes all elements (words.toString returns Set())
  * nums.size nums.contains(3)
  * import scala.collection.mutable
  * val words = mutable.Set.empty[String]
  * words += "the"
  * words -= "the"
  * words ++= List("do", "re", "mi")
  * words --= List("do", "re")
  * words.clear
  *
  */
object SetTest {
  def main(args: Array[String]): Unit = {
   val set= Set(1,2,3,3)
    //求两个集合的交集
   println((set & Set(1, 2, 5)))
    var set2=scala.collection.mutable.Set(1,2,3)
    println((set2 ++= scala.collection.mutable.Set(3, 4, 5)))
  }
}
