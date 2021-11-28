package chapter02

import chapter01.Student

object Test02_Variable {
  def main(args: Array[String]): Unit = {

    // 声明变量时类型可以省略，编译器自动推导，即类型推导
    // 在声明/定义一个变量时，可以使用var或者val来修饰，var修饰的变量可变，val修饰的变量不可变
    var a1: Int = 10
    val a2 = 10

    // 类型确定后就不能修改，说明Scala是强类型语言
    var b1 = 15
//    b1 = "hello" // 错误，不能修改类型

    // 变量声明时，必须要有初始值
//    var a3: Int

    var alice = new Student("Lee", 20)
    alice = new Student("LEE", 22)
    alice = null

    val bob = new Student("bob", 23)
    bob.age = 20
    bob.printInfo()
  }
}
