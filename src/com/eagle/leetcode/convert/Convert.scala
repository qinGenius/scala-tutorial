package com.eagle.leetcode.convert

import java.util

/**
  * A sentence S is given, composed of words separated by spaces. Each word consists of lowercase and uppercase letters only.
  *
  * We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.)
  *
  * The rules of Goat Latin are as follows:
  *
  * If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
  * For example, the word 'apple' becomes 'applema'.
  *  
  * If a word begins with a consonant (i.e. not a vowel), remove the first letter and append it to the end, then add "ma".
  * For example, the word "goat" becomes "oatgma".
  *  
  * Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
  * For example, the first word gets "a" added to the end, the second word gets "aa" added to the end and so on.
  * Return the final sentence representing the conversion from S to Goat Latin. 
  *
  * 来源：力扣（LeetCode）
  * 链接：https://leetcode-cn.com/problems/goat-latin
  * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
  */
object Convert {
  def intToRoman(num: Int): String = {
    ""
  }

  def toGoatLatin(s: String): String = {
    require(s != null, "s is require not null")
    val vowelCaseList: List[String] = List("a", "e", "i", "o", "u")
    val suffix = "ma"
    var count = 0
    var list = new util.ArrayList[String]();
    s.split(" ").toList.foreach(item => {
      var sb = new StringBuilder
      count = count + 1
      var itemProcessed =""
      var  resultItem = appendString("a", count)
      if (vowelCaseList.exists(_.equals(String.valueOf(item.charAt(0))))) {
         itemProcessed = sb.append(item).append(suffix).toString()
      } else {
       val result= moveFirstElementToTail(item)
        itemProcessed=  sb.append(result).append(suffix).toString()
      }
      list.add(itemProcessed+resultItem)
    })
    list.toArray.mkString(""," ","")

  }

  private def appendString(a: String, count: Int): String = {
    var sb = new StringBuilder
    for (i <- 1 to count) {
      sb.append(a)
    }
    sb.toString()
  }

  def moveFirstElementToTail(a:String):String={
   if (a.length==1) a
   else {
    var sb= new StringBuilder
     val list:List[Char]=a.toList
     val firstElement:Char=list.head
     val remains:List[Char]=list.tail
     val newList=remains :+ firstElement
     for(i <- 0 until newList.length){
       sb.append(newList(i))
     }
     sb.toString()
   }
  }

  def main(args: Array[String]): Unit = {
    println(List(1,3,5).toString())

    println(moveFirstElementToTail("12345"))


    val s:String=toGoatLatin("123 456 a89")
    println(s)

  }
}
