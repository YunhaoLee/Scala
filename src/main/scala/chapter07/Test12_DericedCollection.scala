package chapter07

object Test12_DericedCollection {
  def main(args: Array[String]): Unit = {

    val list1 = List(1, 3, 4, 5, 6, 8, 2, 89)
    val list2 = List(3, 4, 9, 5)

    // 1）获取集合的头
    println(list1.head)
    println(list2.head)

    // 2）获取集合的尾(不是头剩下的都是尾)
    println(list1.tail)
    println(list2.tail)

    // 3）集合最后一个数据
    println(list1.last)
    println(list2.last)

    // 4）集合初始数据(不包含最后一个)
    println(list1.init)

    // 5）反转
    println(list1.reverse)

    // 6）取前(后)n个元素
    println(list1.take(2))
    println(list1.takeRight(2))

    // 7）去掉前(后)n个元素
    println(list1.drop(3))
    println(list1.dropRight(3))

    // 8）并集
    println(list1.union(list2))
    println(list1 ::: list2)

    // 如果是set做并集，会去重
    val set1 = Set(1, 3, 4, 5, 6, 8, 2, 89)
    val set2 = Set(3, 4, 9, 5)
    println(set1.union(set2))

    // 9）交集
    println(list1.intersect(list2))

    // 10）差集
    println(list1)
    println(list2)
    println(list1.diff(list2)) // 列出list1中list2没有的元素
    println(list2.diff(list1)) // 列出list1中list2没有的元素

    // 11）拉链
    // 如果两个集合的元素个数不相等，那么会将同等数量的数据进行拉链，多余的数据省略不用
    println(list1.zip(list2))
    println(list2.zip(list1))

    // 12）滑窗
    println("===================================")
    for(elem <- list1.sliding(3)) println(elem)
    println("===================================")
    for(elem <- list1.sliding(3, 2)) println(elem)
  }
}
