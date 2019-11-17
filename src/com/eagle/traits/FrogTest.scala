package com.eagle.traits

object FrogTest {
  def main(args: Array[String]): Unit = {
    val frog = new Frog
    frog.philosophize()

    val phil:Philosophical=frog

    frog.hasLeg()

    val component = new Component(new Point(0,10),new Point(10,0))
    println(component.width)

    println(    (new NumberTest(3, 2).play(0, 0))
    )
  }
}
