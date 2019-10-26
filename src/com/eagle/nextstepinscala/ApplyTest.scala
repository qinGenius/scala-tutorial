package com.eagle.nextstepinscala

/**
  * scala中apply方法的调用规则说明
  * any application of an object to
  * some arguments in parentheses will be transformed to an apply method call.
  * Of course this will compile only
  * if that type of object actually defines an apply method.
  * So it’s not a special case; it’s a general rule.
  *
  *
  * 这里我根据自己的理解说明一下，如果一个对象后面直接用()的话，例如 ApplyTest("啊") 如果这个对象
  * 存在apply方法时，这个对象可以存在多个apply方法。其scala编译器会自动编译成
  * ApplyTest.apply("啊")
  * 进行方法调用
  *
  * 这也从侧面说明了，为什么对数组元素的访问用arr(index:Int)形式了，其实还是调用数组对象的apply方法，
  * 参考实例见如下案例
  * @author qinlinsen
  */
object ApplyTest {
  def apply(a:String):Unit={
    println("这是用apply方法调用的："+a)
  }


  /**
    * 这里
    * @param a
    * @param b
    */
  def apply(a:String,b:String):Unit={
    println("这是用apply方法调用的："+a+b)
  }

  def apply(a:String,b:String,c:String):Unit={
    println("这是用apply方法调用的："+a+b+c)
  }
  def main(args: Array[String]): Unit = {
    //对一个参数的
    //用隐式的apply方法调用
    ApplyTest("隐式");
    //用显式的apply方法调用
    ApplyTest.apply("显式")

    //对二个参数的
    ApplyTest("一个参数"," 另一个参数")//等价于：ApplyTest.apply("一个参数"," 另一个参数");
    //对三个参数的
    ApplyTest("一个参数"," 另一个参数","在来一个参数")//ApplyTest.apply("一个参数"," 另一个参数","在来一个参数");

  }
}
