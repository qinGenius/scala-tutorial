package com.eagle.builtincontrolstructure

import java.io.{BufferedReader, InputStreamReader}

/**
  * 找出一个List[String] 中所有以.scala结尾，但是不以连字符（——）开始的所有字符串
  */
object WithoutBreakAndContinueTest {

  def exitWhileLoop()={
    val in=new BufferedReader(new InputStreamReader(System.in))
    /*breakable{
      while (true) {
        println("? ")
        if (in.readLine() == "") break
      }
    }*/
  }
  def searchFrom(sourceList:List[String]):List[String]={
    for{
      item <- sourceList
      if item.endsWith(".scala")
      value = "_"
      if ! item.startsWith(value)
    }yield item
  }
  def main(args: Array[String]): Unit ={
    searchFrom(List("a.scala","_.scala","cddd.d")).foreach(println)

  }

}
