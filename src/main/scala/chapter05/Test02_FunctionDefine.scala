package chapter05

object Test02_FunctionDefine {
  def main(args: Array[String]): Unit = {
    // 1）函数1：无参，无返回值
    def f1(): Unit = {
      println("1. 无参无返回")
    }
    f1()
    println(f1())
    println("===============")

    // 2）函数2：无参，有返回值
    def f2(): Int = {
      println("2. 无参有返回")
      return 2
    }
    println(f2())
    println("===============")

    // 3）函数3：有参，无返回值
    def f3(name: String): Unit = {
      println("3. 有参无返回 " + name)
    }
    println(f3("lee"))
    println("===============")

    // 4）函数4：有参，有返回值
    def f4(name: String): String = {
      println("4. 有参有返回 " + name)
      return "hi, " + name
    }
    println(f4("lee"))
    println("===============")

    // 5）函数5：多参，无返回值
    def f5(name: String, name2: String): Unit = {
      println("5. 多参无返回 " + name + ", " + name2)
    }
    println(f5("lee", "alice"))
    println("===============")

    // 6）函数6：多参，有返回值
    def f6(name: String, name2: String): String = {
      println("5. 多参无返回 " + name + ", " + name2)
      return  name + name2
    }
    println(f6("lee", "alice"))
    println("===============")

  }
}
