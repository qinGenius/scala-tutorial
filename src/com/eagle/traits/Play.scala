package com.eagle.traits

/**
  * define a Trait with type parameter
  * @tparam T
  */
trait Play[T] {
  def play(one :T,that :T):T
}
