package chapter05

object Test08_Practice {
  def main(args: Array[String]): Unit = {

    // 练习1：定义一个匿名函数，并将它作为值赋给变量fun。函数有三个参数，类型分别为Int，String，Char，返回值类型为Boolean要求
    // 调用函数fun（0,"",'0'）得到返回值为 false，其它情况均返回true
    val fun = (i: Int, s: String, c: Char) => {
      if (i == 0 && s == "" && c == '0')
        false
      else
        true
    }
    println(fun(0,"",'0'))
    println(fun(0,"1",'0'))
    println("==============================")

    // 练习2：定义一个函数func，它接收一个Int类型的参数，返回一个函数（记作f1）
    // 它返回的函数f1，接收一个String类型的参数，同样返回一个函数（记作f2）。
    // f2函数接收一个Char类型的参数，返回一个Boolean的值。
    // 要求调用函数func(0)("")(0)得到返回值为 false，其它情况均返回true
    def func(i: Int): String => (Char => Boolean) = {
      def f1(s: String): Char => Boolean = {
        def f2(c: Char): Boolean = {
          if (i == 0 && s == "" && c == '0')
            false
          else
            true
        }
        f2
      }
      f1
    }
    println(func(0)("")('0'))
    println(func(0)("")('1'))
    println("==============================")

    // 匿名函数简写
    def func1(i: Int): String => (Char => Boolean) = {
      s => c => if (i == 0 && s == "" && c == '0') false else true
    }
    println(func1(0)("")('0'))
    println(func1(0)("")('1'))
    println("==============================")

    // 柯里化
    def func2(i: Int)(s: String)(c: Char): Boolean = {
      if (i == 0 && s == "" && c == '0') false else true
    }
    println(func2(0)("")('0'))
    println(func2(0)("")('1'))
    println("==============================")
  }
}
