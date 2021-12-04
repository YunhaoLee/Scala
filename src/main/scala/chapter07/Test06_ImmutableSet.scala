package chapter07

object Test06_ImmutableSet {
  def main(args: Array[String]): Unit = {
     // 1. 创建set
    val set1 = Set(1, 2, 3, 4, 5, 6, 2, 7) // 会去重，不保证顺序
    println(set1)
    println("=======================================")

    // 2. 添加元素
    val set2 = set1 + 233
    println(set1)
    println(set2)
    println("=======================================")

    // 3. 合并set
    val set3 = Set(19, 53, 63, 78)
    val set4 = set2 ++ set3
    println(set4)
    println("=======================================")

    // 4. 删除元素
    val set5 = set3 - 19
    println(set3)
    println(set5)
    println("=======================================")

  }
}
