package com.eagle.workingwithothercollections

/**
  * unlike Array or List ,a tuple can hold  objects with different types.
  */
object TupleTest {


  def longestWord(words:Array[String]):(String,Int)={
    require(words !=null,"arr is require not null")
    if(words.length==1){
       (words(0),0)
    }
    var index=0
    var word=words(0)
    for(i <- 0 until words.length){
      if(words(i).length>word.length){
        word=words(i)
        index=i;
      }
    }
    (word,index)
  }
  def main(args: Array[String]): Unit = {
    //a tuple hold an Int String and Console
    println(((1, "ren", Console)))
    val tuple = longestWord(Array("a","ab","abc"))
    println(tuple)
    //访问tuple中的元素：
    println(tuple._1)
    println(tuple._2)
  }

}
