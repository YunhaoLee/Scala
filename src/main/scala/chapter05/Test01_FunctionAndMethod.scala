package chapter05

object Test01_FunctionAndMethod {
  def main(args: Array[String]): Unit = {

    // 定义函数
    def sayHi(name: String): Unit = {
      println("hi, " + name)
    }

    // 调用函数
    sayHi("lee")

    // 调用对象方法
    Test01_FunctionAndMethod.sayHi("lee")

    val res = Test01_FunctionAndMethod.sayHello("lee")
    println(res)
  }

  // 定义对象的方法(作用域不一样所以不会报错)
  def sayHi(name: String): Unit= {
    println("Hi, " + name)
  }

  def sayHello(name: String): String= {
    println("Hello, " + name)
    return "Hello"
  }

}
