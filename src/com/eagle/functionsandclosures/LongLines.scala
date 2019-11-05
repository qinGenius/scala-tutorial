package com.eagle.functionsandclosures
import scala.io._
import java.io._
object LongLines {
  def printLines(fileAbsolutePath:String):Unit={
    require(fileAbsolutePath!=null,"fileAbsolutePath cannot be null")
   val lines= Source.fromFile(fileAbsolutePath).getLines()
   val fileName=  new File(fileAbsolutePath).getName
    lines.foreach(line => processLines(fileName,line,60))

  }
  //define a method
  private def processLines(fileName:String,line :String, width:Int):Unit={
    //check parameters
    require(fileName!=null,"file name cannot be null")
    require(line !=null,"line cannot be null")
    require(width != null,"width cannot be null")
    //print line's length greater than the given length width
    if(line.length >width)
      println(s"${fileName}:${line}")
  }

  def main(args: Array[String]): Unit = {
   val  fileAbsolutePath :String="/Users/hatarinshou/ScalaProjects/demoProjects/helloScala/src/com/eagle/firststepinscala/functionTest2.scala"
    printLines(fileAbsolutePath)
  }

}
