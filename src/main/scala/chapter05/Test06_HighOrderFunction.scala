package chapter05

object Test06_HighOrderFunction {
  def main(args: Array[String]): Unit = {
    def f(n: Int): Int = {
      println("f调用")
      n + 1
    }

    def fun(): Int = {
      println("fun调用")
      1
    }

    val res = f(123)
    println(res)

    fun()
    fun

    // 1. 函数可作为值进行传递
    val f1: Int => Int = f
    val f2 = f _
    println(f1) // 打印的函数的引用地址
    println(f1(12))
    println(f2) // 打印的函数的引用地址
    println(f2(12))

    val f3 = fun
    println(f3)
    val f4 = fun _
    println(f4)
    val f5: () => Int = fun
    println(f5)

    // 2. 函数可以作为参数进行传递
    // 定义一个二元计算函数
    def dualEval(op: (Int, Int) => Int, a: Int, b: Int): Int = {
      op(a, b)
    }
    def add(a: Int, b: Int): Int = {
      a + b
    }
    println(dualEval(add, 1, 2))
    println(dualEval(_ + _, 1, 2))

    // 3. 函数可以作为函数的返回值返回
    def f6(): Int => Unit = {
      def f7(a: Int) = {
        println("f6调用 " + a)
      }
      f7 // 将函数直接返回
    }
    println(f6()) // 返回的是函数对象所以是返回引用地址
    val f7 = f6()
//    println(f7)
    println("=======================")
    println(f7(25))
    println("=======================")
    println(f6()(25))

  }
}
