package com.eagle.controlabstraction

object StringMatcher {
  private def stringMatcher(sourceList:List[String],matcher: String => Boolean):List[String]={
    for{
      item <- sourceList if matcher(item)
    }yield item
  }
  //_.endsWith(query) _这个placeholder代表的是sourceList中的每一个元素
  def endWith(sourceList:List[String],query:String):List[String]={
    stringMatcher(sourceList,_.endsWith(query))
  }

  def contains(sourceList:List[String],query:String):List[String]={
    stringMatcher(sourceList,_.contains(query))
  }

  def main(args: Array[String]): Unit = {
    val sourceList=List("a.txt","b.txt","c.d")
    endWith(sourceList,"txt").foreach(println)
    println("---------------------------------------------------")
    contains(sourceList,"c").foreach(println)
  }
}
