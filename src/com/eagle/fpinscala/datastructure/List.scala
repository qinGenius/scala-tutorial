package com.eagle.fpinscala.datastructure

/**
  * type parameter A 前面加variance annotation A的主要作用是为了编译器的类型推断，
  * 让编译器推断出类型更简单些
  * 3mIt is certainly possible to write code without using variance annotations at all,
  * and function signatures are sometimes simpler (while type inference often gets worse).
  * Unless otherwise noted, we will be using variance annotations throughout this book,
  * but you should feel free to experiment with both approaches.
  *
  *
  *
  *
  * More about variance
  * In the declaration trait List[+A], the + in front of the type parameter A is a variance annotation which signals
  * that A is a covariant or 'positive' parameter of List. This means that, for instance, List[Dog] is considered a
  * subtype of List[Animal], assuming Dog is a subtype of Animal. (More generally, for all types X and Y, if X is a
  * subtype of Y then List[X] is a subtype of List[Y]). We could leave out the + in front of the A, which would make
  * List invariant in that type parameter.
  * But notice now that Nil extends List[Nothing]. Nothing is a subtype of all types, which means that in conjunction
  * with the variance annotation, Nil can be considered a List[Int], a List[Double], and so on, exactly as we want.
  * These concerns about variance are not very important for the present discussion and are more of an artifact of
  * how Scala encodes data constructors via subtyping, so don't worry if this is not completely clear right now.3
  */
 trait List[+A] {

  case object Nil extends List[Nothing]

  case class Cons[+A](head:A,tail:List[A]) extends List[A]

  object List{
    def sum(ints:List[Int]):Int= ints match {
      case Nil => 0
      case Cons(head, tail) => head + sum(tail)
    }

    def product(ints:List[Int]):Int=ints match {
      case Nil => 0
      case Cons(0,_) => 0
      case Cons(head,tail) => head * product(tail)
    }
    //variadic function 【variadic function】
    def apply[A](as: A*):List[A]={
      if(as.isEmpty) Nil
      else Cons(as.head,apply(as.tail: _*))
    }

  }


}
