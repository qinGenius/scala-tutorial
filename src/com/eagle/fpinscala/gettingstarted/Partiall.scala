package com.eagle.fpinscala.gettingstarted

object Partiall {
  def partially[A,B,C](a:A,f:(A,B) => C): B =>C ={
    (b:B) => f(a,b)
  }
}
