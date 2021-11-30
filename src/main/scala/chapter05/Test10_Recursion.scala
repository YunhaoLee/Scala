package chapter05

import scala.annotation.tailrec

object Test10_Recursion {


  def main(args: Array[String]): Unit = {
    println(fact(5))
  }

  // 递归实现计算阶乘
  def fact(n: Int): Int = {
    if (n == 0) return 1   // 只有最后一行是返回值，不能省略return
    fact(n - 1) * n        // 最后一行作为返回值 所以return可以省略
  }

  // 尾递归
  def tailFact(n: Int): Int = {
    @tailrec
    def loop(n: Int, curRes: Int): Int = {
      if (n == 0) return curRes
      loop(n - 1, curRes * n)
    }
    loop(n, 1)
  }
  println(tailFact(5))
}
