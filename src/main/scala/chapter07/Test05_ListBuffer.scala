package chapter07

import scala.collection.mutable.ListBuffer

object Test05_ListBuffer {
  def main(args: Array[String]): Unit = {
    // 1. 创建可变列表
    val list1 = new ListBuffer[Int]()
    val list2 = ListBuffer(1, 2, 3)
    println(list1)
    println(list2)
    println("======================================")

    // 2. 添加元素
    list1.append(1, 2, 3, 4)
    list2.prepend(20, 30)
    list1.insert(1, 5)
    println(list1)
    println(list2)

    list1 += 25 += 26 += 77
    31 +=: 99 +=: list1
    println(list1)

    // 3. 合并list
    val list3 = list1 ++ list2
    println(list3)

    list1 ++= list2  // 两个加到list1
    println(list1)

    list1 ++=: list2 // 两个加到list2
    println(list2)

    // 4. 修改元素
    list2(2) = 30
    println(list2)

    // 5.删除元素
    list2.remove(2)
    println(list2)
    list2.remove(2, 2)
    println(list2)
    list2 -= 3
    println(list2)
  }
}
