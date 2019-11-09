package com.eagle.builtincontrolstructure

import java.io._



/**
  * A generator defines a named val and assigns to it
  * a series of values in a for expression. For example, in for(i <- 1 to 10), the
  * generator is “i <- 1 to 10”. The value to the right of the <- is the
  * generator expression.
  *
  * A generator expression generates a series of values in a for expression.
  */
object ForTest {
  def printAllFilesInDirectory(directory: String): Unit = {
    val file = new File(directory)
    if (file.isDirectory) {
      val files = file.listFiles()
      // f <- files which is called generator
      //位于这个符号 <- 右边的叫：generator expression
      for (f <- files) {
        println(f)
      }
    }
  }

  def printElement(): Unit = {
    // 1 to 10 [1,10]
    for (i <- 1 to 10)
      println(i)


    print("+++++++++++++++++++++++++++++++")
    // 1 until 10 不包括10 [1,10)
    for (i <- 1 until 10)
      println(i)
  }

  /**
    * for(int i=0;i<10;i++){
    *   System.out.println(i)
    * }
    *
    * 在scala中可以这样写,具体参考
    * emulateJavaForLoop方法，
    * 不过这种方法在scala中不常用
    */
  def emulateJavaForLoop(): Unit = {
    val list = List("a", "b", "c", "d", "e");
    for (i <- 0 until list.size)
      println(s"${i}======${list(i)}")
  }

  /**
    * 从这个例子可以看出for 循环中的多个filter是&&关系
    * @param directory
    */
  def filterInForLoop(directory:String):Unit={
    val filesHere:Array[File]=new File(directory).listFiles()
    for(
      file <- filesHere
      if file.isDirectory
      if file.getName.endsWith(".git")
    )
      println(file.getName)
  }

  def filterLines(file:File):List[String]=scala.io.Source.fromFile(file).getLines().toList

  def filesHere(directory:String):Array[File] = new File(directory).listFiles

  def grep(pattern: String,directory:String) =
    for {
      file <- filesHere(directory)
      if file.getName.endsWith(".scala")
      line <- filterLines(file)
      trimmed = line.trim
      if trimmed.matches(pattern)
    } println(file + ": " + trimmed)

  /**
    * for clauses yield boy
    *
    *
    *
    * Each time the body of the for expression executes, it produces one value,
    * in this case simply Int. When the for expression completes,
    * the result will include all of the yielded values contained in a single collection.
    * The type of the resulting collection is based on the kind of collections
    * processed in the iteration clauses.
    * @param numList
    * @return
    */
   def selectedEvenNumberFromList(numList:List[Int]):List[Int]={
     for{
       num <- numList if num %2 ==0
     }yield num
   }

  def main(args: Array[String]): Unit = {
    val currentDirectory = ".";
    //打印当前目录的所欲文件
    //    printAllFilesInDirectory(currentDirectory)
    //    printElement();
//    emulateJavaForLoop();
//    filterInForLoop(currentDirectory)
//    filterInForLoop(currentDirectory)
    val evenNumberList = selectedEvenNumberFromList(List(1,2,3,4,5,6,7,8,9,10))
    for(i <- 0 until  evenNumberList.length)
      println(evenNumberList(i))
  }
}
