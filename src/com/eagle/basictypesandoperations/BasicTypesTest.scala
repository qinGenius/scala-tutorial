package com.eagle.basictypesandoperations

object BasicTypesTest extends App {
  /**
    * scala中的Raw String 是三引号围起来的字符串
    */
  new RawStringTest().printRawStr(
    """33
      3woi3
      reio
      wieo
        ewioi
          ewo
            ewo
              o
    """.stripMargin)

  println("===================================================================")
  /**
    *这个| s称为stripMargin，在运行是会自动去掉。
    */
  println(
    """a
      |b
      |c
      |d
      |e
      |
    """.stripMargin)
}
