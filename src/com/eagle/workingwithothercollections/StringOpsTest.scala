package com.eagle.workingwithothercollections

object StringOpsTest {
  //这里牵涉到了String 和StringOps的implicitly conversion
  def hasUpperCase(s:String):Boolean=s.exists(_.isUpper)
  def hasLowerCase(s:String):Boolean=s.exists(_.isLower)
  def main(args: Array[String]): Unit = {
   println (hasLowerCase("iiiiiO"))
  }

}
