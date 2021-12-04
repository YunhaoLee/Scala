package chapter07

import scala.collection.mutable

object Test09_MutableMap {
  def main(args: Array[String]): Unit = {
    // 1. 创建map
    val map1 = mutable.Map("a" -> 13, "b" -> 25, "hello" -> 3)
    println(map1)
    println(map1.getClass)

    // 2. 添加元素
    map1.put("c", 5)
    map1.put("b", 9)
    println(map1)

    map1 += (("e", 7))
    println(map1)
    println("=================")

    // 3. 删除元素
    println(map1("c"))
    map1.remove("c")
//    println(map1("c"))
    println(map1.getOrElse("c", 0))
    println(map1)

    map1 -= "e"
    println(map1)
    println("==================")

    // 4. 修改元素
    map1.update("b", 20)
    println(map1)
    println("==================")

    // 5. 合并两个Map
    val map2 = Map("aaa" -> 11, "b" -> 29, "hello" -> 5)
    map1 ++= map2  // map1中重复key的值会被map2中的覆盖
    println(map1)

    val map3 = map2 ++ map1
    println(map1)
    println(map2)
    println(map3)

  }
}
