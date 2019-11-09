package com.eagle.leetcode.array

/**
  * Given an array, rotate the array to the right by k steps, where k is non-negative.
  *
  * Example 1:
  *
  * Input: [1,2,3,4,5,6,7] and k = 3
  * Output: [5,6,7,1,2,3,4]
  * Explanation:
  * rotate 1 steps to the right: [7,1,2,3,4,5,6]
  * rotate 2 steps to the right: [6,7,1,2,3,4,5]
  * rotate 3 steps to the right: [5,6,7,1,2,3,4]
  * Example 2:
  *
  * Input: [-1,-100,3,99] and k = 2
  * Output: [3,99,-1,-100]
  * Explanation:
  * rotate 1 steps to the right: [99,-1,-100,3]
  * rotate 2 steps to the right: [3,99,-1,-100]
  *
  * 来源：力扣（LeetCode）
  * 链接：https://leetcode-cn.com/problems/rotate-array
  * gcd
  * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
  */
object ArrayRotate{

  def rotate[T](arr:Array[T],step:Int):Array[T]={
    require(arr !=null ,"arr is require not null")
    require(step>=0,"step is non negative")
//    val firstElement=arr[0]
//    arr.slice()
      if(arr.length==0){
        throw new RuntimeException("array is empty");
      }

   /* var firstElemnt:T=arr(0)
    var other:Array[T] =Array(firstElemnt)
    var remainElements:Array[T]=null;
    if(arr.length==1) remainElements=null else remainElements=arr.slice(2,arr.length)
*/
    return null;
  }
  def main(args: Array[String]): Unit = {
    val array = Array(1, 2, 3)
    val a=array.slice(0,3).foreach(println)
  }
}
