package chapter01

/*
  Object:关键字，声明一个单例对象（伴生对象）
 */
object HelloWorld {

  /*
    main方法：从外部可直接调用执行的方法
    def 方法名称（参数名称: 参数类型）: 返回值类型 = { 方法体 }
   */
  def main(args: Array[String]): Unit = {
    println("hello world")
    System.out.println("hello java")
  }
}