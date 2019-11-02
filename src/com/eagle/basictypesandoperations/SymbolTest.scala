package com.eagle.basictypesandoperations

/**
  * Symbol lit- erals are typically used in situations
  * where you would use just an identifier in a dynamically typed language.
  * @author qinlinsen
  */
object SymbolTest {
  def test(a:Symbol):Unit=println(a)
  def main(args: Array[String]): Unit = {
     println('S)
    println(Symbol("weio"))
    //证明'a的类型是Symbol
    println('a.isInstanceOf[Symbol])
    test(Symbol("aaa"))
    test('aaaaaa)
  }
}
