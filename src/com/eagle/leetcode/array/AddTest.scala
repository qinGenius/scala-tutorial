package com.eagle.leetcode.array

import java.util

/**
  * Given an array of integers, return indices of the two numbers such that
  * they add up to a specific target.
  *
  * You may assume that each input would have exactly one solution,
  * and you may not use the same element twice.
  *
  * Example:
  *
  * Given nums = [2, 7, 11, 15], target = 9,
  *
  * Because nums[0] + nums[1] = 2 + 7 = 9,
  * return [0, 1].
  *
  * 来源：力扣（LeetCode）
  * 链接：https://leetcode-cn.com/problems/two-sum
  * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
  */
object AddTest {
  def twoSum(nums:List[Int],target:Int):util.ArrayList[Int]={
    require(nums!=null,"nums is required")
    require(target!=null,"target is not null")
    var resultList=new util.ArrayList[Int](2);
    for(i <- 0 until nums.length-1){
      for(j <- 1 until nums.length){
        var tmp=nums(i)+nums(j)
        if(i !=j && tmp==target){
          resultList.add(i)
          resultList.add(j)
        }
      }
    }


    resultList;
    }



  def main(args: Array[String]): Unit = {
    twoSum(List(1,8,10,15),25).stream().forEach(println)

  }
}
