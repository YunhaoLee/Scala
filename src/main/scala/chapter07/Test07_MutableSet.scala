package chapter07

import scala.collection.mutable

object Test07_MutableSet {
  def main(args: Array[String]): Unit = {
    val set1 = mutable.Set(1, 2, 3, 4, 5, 6, 2, 7) // 会去重，不保证顺序
    println(set1)

    // 2. 添加元素
    val set2 = set1 + 11
    println(set1)
    println(set2)

    set1 += 12
    println(set1)

    val flag1 = set1.add(13) // flag表示是否添加元素成功
    println(set1)
    println(flag1)

    val flag2 = set1.add(13)
    println(set2)
    println(flag2)   // 因为已经存在所以为false

    // 3. 删除元素
    set1 -= 13
    println(set1)

    val flag3 = set1.remove(5)
    println(set1)
    println(flag3)
    println("=========================================")

    // 4. 合并两个Set
    val set3 = mutable.Set(13, 12, 13, 27, 98, 29)
    println(set1)
    println(set3)
    val set4 = set1 ++ set3
    println(set1)
    println(set4)
    set1 ++= set3
    println(set1)

  }
}
