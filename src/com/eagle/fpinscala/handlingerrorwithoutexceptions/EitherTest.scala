package com.eagle.fpinscala.handlingerrorwithoutexceptions

object EitherTest {
  def saveDivide(x:Double,y:Double):Either[Exception,Double]={
    try {
      Right(x / y)
    } catch {
      case e:Exception => Left(e)
    }
  }

  def newStudent(name:String):Either[String,Student]={
    if(name ==null || name.isEmpty )
      Left("name is Empty")
    else Right(new Student("3",name))
  }
  def main(args: Array[String]): Unit = {
    val result = saveDivide(1,0)
    println(result.getOrElse("分母是0"))

    val student=newStudent("jesus");
    println(student.getOrElse())
  }
}
