package chapter07

object Test03_MulArr {
  def main(args: Array[String]): Unit = {
    // 1. 创建二维数组
    val arr = Array.ofDim[Int](2, 3)

    // 2. 访问元素
    arr(0)(2) = 19
    arr(1)(0) = 25
    println(arr.mkString(","))

    for (i <- 0 until arr.length; j <- 0 until arr(i).length) {
      println(arr(i)(j))
    }

    for (i <- arr.indices; j <- arr(i).indices) {
      print(arr(i)(j) + "\t")
      if (j == arr(i).length - 1) println()
    }

    arr.foreach(_.foreach(println))
  }
}
