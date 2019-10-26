package com.eagle.nextstepinscala

object ArrayTest2 {
  def main(args: Array[String]): Unit = {
     val greetingString= new Array[String](5);
    //给数组赋值
    greetingString(0)="zeroElement"
    //判断 greetingString 的类型是 Array[String]]
    //arrays in Scala are accessed by placing the index inside parentheses,
    // not square brackets as in Java.
    //上面的英文意思是： 在scala中访问数组的元素用（）,而在java中是[]
     println(greetingString.isInstanceOf[Array[String]])
    //访问元素：
    println("访问数组第1个元素",greetingString(0))

    //给数组赋值：0 to 4 其实质就是数学中的闭区间[0,4]
    //在scala中所有的操作符都是方法，这个to也是方法
    //if a method takes only one parameter, you can call it without a dot or parentheses.
    //例如下面的to这个方法 0 to 4 等同于 0.to(4)
    //在比如1+5 等同于 (1).+(5)
    for(i <- 0 to 4){
      greetingString(i)=i.toString;
    }

    for (i <- 0.to(4)){
      greetingString(i)=i.toString();
    }

    println((1).+(5))//等同于1+5 ,这个+号也是方法名
    //访问数组元素：
    greetingString.foreach(println)

    //------------------------------------//
    //从下面的演示我们可以说明：              //
    //数组元素的赋值其实质就是调用update方法   //
    //------------------------------------//


    //更新第二个元素：
    greetingString.update(1,"update the second element")
    //直接用赋值来更新：
    println(greetingString(1))
    greetingString(1)="with assignment to update";
    println(greetingString(1))
    //用apply的方法得到数组第二个元素的值：

    println("第二个元素的值是："+greetingString.apply(1))


  }
}
