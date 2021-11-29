package chapter02

import scala.io.StdIn

object Test04_StdIn {
  def main(args: Array[String]): Unit = {
    // 输入信息
    println("请输入您的大名： ")
    val name = StdIn.readLine()
    println("请输入您的年龄： ")
    val age = StdIn.readInt()

    println(s"${age}的${name}")
  }

}
