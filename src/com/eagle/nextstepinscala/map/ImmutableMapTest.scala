package com.eagle.nextstepinscala.map

object ImmutableMapTest {
  def main(args: Array[String]): Unit = {
    /**
      * map 默认就是Immutable Map形式的，因此不需要导入任何包
      */
    var immutableMapTest=Map("paris".->("France"),"北京"->"中国");
    println(immutableMapTest)
  }
}
