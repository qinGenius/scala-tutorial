package com.eagle.nextstepinscala.set

import scala.collection.immutable.HashSet

object ImmutableHashSetTest {

  def main(args: Array[String]): Unit = {
    var immutableHashSetTest=HashSet(1,3,5);
    immutableHashSetTest+=6;
    println(immutableHashSetTest.foreach(println))
  }

}
