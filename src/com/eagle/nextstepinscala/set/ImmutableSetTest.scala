package com.eagle.nextstepinscala.set

/**
  *scala默认用的set集合是immutable的，如果需要用mutable的需要导包scala.collection.mutable.Set
  *注意immutable set如果要添加元素必须用var来修饰，如果用val来修饰会报错
  * @author qinlinsen
  */
object ImmutableSetTest {

  def main(args: Array[String]): Unit = {
    //实例化Set集合 这里必须用var 来修饰
     var immutableSetTest=Set.apply(1,2,3)
    //添加Set元素
     immutableSetTest.+=(12)
    //访问set集合中的元素
    println(immutableSetTest.foreach(println))
    //判断Set集合中是否包涵某一个元素：
    println(immutableSetTest.contains(2))
    //判断Set的类型是否是Set[Int]
    println(immutableSetTest.isInstanceOf[Set[Int]])
  }
}
