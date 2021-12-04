package chapter07

object Test04_List {
  def main(args: Array[String]): Unit = {
    // 1. 创建一个List
    val list = List(1, 2, 3, 4)
    println(list)
    println(list.mkString(","))

    // 2. 访问和遍历元素
    println(list(1))
    list.foreach(println)

    // 3. 添加元素
    val list2 = list :+ 10
    val list3 = 20 +: list2
    println(list2.mkString(","))
    println(list3.mkString(","))

    val list4 = list3.::(51) // 把括号中元素加在开头
    println(list4.mkString(","))

    val list5 = Nil.::(13)
    println(list5)

    val list6 = 32 :: Nil
    val list7 = 17 :: 28 :: 59 :: 29 :: Nil
    println(list6)
    println(list7)

    val list8 = list6 :: list7
    println(list8)

    val list9 = list6 ::: list7  // 所有元素拆开放到一个列表里
    println(list9)

    val list10 = list6 ++ list7
    println(list10)
  }
}
