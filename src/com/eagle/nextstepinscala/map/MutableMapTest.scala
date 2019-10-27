package com.eagle.nextstepinscala.map
import scala.collection.mutable
object MutableMapTest {
  /**
    * 注意scala中的Map键值对之间用 向右箭头链接
    */
  def main(args: Array[String]): Unit = {
    //实例化Map
    val mutableMapTest = mutable.Map[Int, String]();
    mutableMapTest.+=(97 -> "a")
    mutableMapTest += (98 -> "b")
    mutableMapTest += (99 -> "c")
    //从这里可以看出->是一个函数
    mutableMapTest.+=(100.->("d"));
    //遍历map集合
    mutableMapTest.foreach(println)

  }

}
