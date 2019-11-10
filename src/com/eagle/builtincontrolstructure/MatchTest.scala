package com.eagle.builtincontrolstructure

object MatchTest {
  def selectFood(name:String):Unit=name match{
    case "john" => println("rice")
    case "mary" => println("salad")
    case "jesus" => println("spring")
  }
  // a match expresion that yields a value
  def selectFood(age:Int)=age match{
    case 1 => "old"
    case 2 => "senior"
    case 3 => "minor"
    case _ =>"不确定"
  }
  def main(args: Array[String]): Unit = {
    selectFood("john")
    println(selectFood(91))
  }
}
