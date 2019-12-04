package com.eagle.fpinscala.handlingerrorwithoutexceptions

/**
  * option match {
  * case None => None
  * case Some(x) => foo(x)
  * }
  *
  *
  * f(f(x))=x
  */
object OptionOperation {
  def main(args: Array[String]): Unit = {
  val result=  "hello" match {
      case  ""=> 3
      case "seo" => 4
    }

    println(result)

  }
}
