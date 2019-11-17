package com.eagle.traits

class Component(val x:Point,val y:Point) extends Rectangular {
  override def topLeft: Point = x

  override def bottomRight: Point = y
}
