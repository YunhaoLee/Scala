package chapter07

object Test11_CommonOp {
  def main(args: Array[String]): Unit = {
    val list = List(1, 3, 4, 5, 6, 7)
    val set = Set(23, 34, 423, 75)
    // 1）获取集合长度
    println(list.length)
    println(list.size)

    // 2）获取集合大小
    println(set.size)
    println("===================")

    // 3）循环遍历
    for (elem <- list)
      println(elem)
    set.foreach(println)

    // 4）迭代器
    for (elem <- set.toIterable)
      println(elem)

    // 5）生成字符串
    println(list)
    println(set)
    println(list.mkString("--"))

    // 6）是否包含
    println(list.contains(3))
    println(list.contains(24))
    println(set.contains(23))
  }
}
