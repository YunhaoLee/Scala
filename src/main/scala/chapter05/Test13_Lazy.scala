package chapter05

object Test13_Lazy {
  def main(args: Array[String]): Unit = {
    lazy val res: Int = sum(13, 47)
    println("1. 函数调用")
    println("2. res: " + res)
    println("4. res: " + res)

    def sum(a: Int, b: Int): Int = {
      println("3. 函数调用")
      a + b
    }
  }
}
