package chapter07

object Test13_SimpleFunction {
  def main(args: Array[String]): Unit = {

    val list = List(5, 1, 8, 2, 3, 4)
    val list2 = List(("a", 5), ("b", 1), ("c", 3), ("d", 2), ("e", 6), ("f", 7))

    // 1）求和
    var sum = 0
    for (elem <- list) sum += elem
    println(sum)
    println(list.sum)

    // 2）求乘积
    println(list.product)

    // 3）最大值
    println(list.max)
    println(list2.maxBy((tuple: (String, Int)) => tuple._2))
    println(list2.maxBy(_._2))

    // 4）最小值
    println(list.min)
    println(list2.minBy(_._2))

    // 5）排序
    // 正序
    println(list.sorted)
    println(list2.sortBy(_._2))


    // 逆序
    println(list.sorted.reverse)
    println(list.sorted(Ordering[Int].reverse))
    println(list2.sortBy(_._2)(Ordering[Int].reverse))

    println(list.sortWith((a, b) => a < b))
    println(list.sortWith(_ < _))
    println(list2.sortWith((a, b) => a._2 > b._2))
    println(list2.sortWith(_._2 > _._2))
  }
}
