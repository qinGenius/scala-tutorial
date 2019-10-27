package com.eagle.nextstepinscala
import scala.io._
object FileTest {
  def widthOfLength(s:String):Int={
    return s.length;
  }

  def readFile(fileAbsolutePath: String): Unit ={
    val lines=Source.fromFile(fileAbsolutePath).getLines().toList;
    //获取这个文件最长的那行
    val longestLine=lines.reduceLeft((a,b) => if(a.length>b.length) a else b);

    val maxWidth=widthOfLength(longestLine)

    lines.foreach(eachLine => {
      val numSpace=maxWidth-widthOfLength(eachLine)
      val padding=" "* numSpace;
      println(padding+eachLine.length+" | " +eachLine)
    })
  }
  def main(args: Array[String]): Unit = {
    readFile("你所在文件的路径")
  }
}
