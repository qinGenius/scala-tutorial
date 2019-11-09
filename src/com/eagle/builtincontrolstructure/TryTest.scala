package com.eagle.builtincontrolstructure

import java.io.{File, FileNotFoundException, IOException}
import java.net.{MalformedURLException, URL}

object TryTest {
  def isEven(n:Int):Boolean=if (n % 2 ==0) true else false
  def halfValue(n:Int)=if (isEven(n)) n / 2 else throw new RuntimeException("n must be even number")
  def newFile(path:String):String={
    try {
      new File(path).getName
    } catch {
      case ex: FileNotFoundException => "文件找不到"
      case ex: Exception => "异常"
      case ex: IOException => "IO Exception"
    }
  }

  def tryCatchFinally(path:String)={
      val file=new File(path)
    try {
      println(file.getName)
    }catch {
      case ex:FileNotFoundException=>println("eiowioewoio")
    }
    finally println(file.exists())

  }

  def urlFor(path:String):URL={
    try {
      new URL(path)
    } catch {
      case e: MalformedURLException => new URL("https://github.com")
    }
  }

  /**
    * The best way to think of finally clauses is as a way to ensure some side effect happens,
    * such as closing an open file.
    */
  def f():Int= try return 1 finally return 2
  def g():Int=try 1 finally 2

  def main(args: Array[String]): Unit = {
//    halfValue(5)
    val exceptionMessage = newFile("./ieowioeoiio.txt")
//    println(exceptionMessage)
//    println(urlFor("eiowoi"))
    println(f())
//    println(g())
  }

}
