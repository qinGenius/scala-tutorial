package com.eagle.traits

trait Rectangular {
  def topLeft:Point
  def bottomRight:Point
  def left=topLeft.x
  def right:Int=bottomRight.x
  def width:Int=right-left
}
