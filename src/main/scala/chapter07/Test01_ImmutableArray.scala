package chapter07

object Test01_ImmutableArray {
  def main(args: Array[String]): Unit = {
    // 1. 创建数组
    // 方式一
    val arr = new Array[Int](5)

    // 方式二
    val arr2 = Array(12, 37, 42, 58, 97)
    println(arr2.mkString(","))

    // 查询
    println(arr2(2))  // arr2.apply(2)的缩写
    // 修改
    arr2(2) = 22      // arr2.updete(2) = 22的缩写
    println(arr2(2))
    println("======================================")

    // 3. 数组的遍历
    // 1) 普通for循环
    for (i <- 0 until arr2.length) {
      println(arr2(i))
    }
    println("======================================")

    for (i <- arr2.indices) {
      println(arr2(i))
    }
    println("======================================")

    // 2) 直接遍历所有元素，增强for循环
    for (elem <- arr2) println(elem)
    println("======================================")

    // 3) 迭代器
    val iter = arr2.iterator
    while (iter.hasNext) {
      println(iter.next())
    }
    println("======================================")

    // 4) foreach方法
    arr2.foreach((elem: Int) => println(elem))
    println("======================================")

    arr2.foreach(println)
    println("======================================")

    println(arr2.mkString(","))
    println("======================================")

    // 4. 添加元素
    val new_arr1 = arr2.:+(2)
    println(new_arr1.mkString(","))

    val new_arr2 = new_arr1.+:(3)
    println(new_arr2.mkString(","))

    val new_arr3 = new_arr2 :+ 4
    println(new_arr3.mkString(","))

    val new_arr4 = 5 +: new_arr3
    println(new_arr4.mkString(","))

    // :在哪边变量在哪边
    val new_arr5 = 9 +: 6 +: new_arr4 :+ 7 :+ 8
    println(new_arr5.mkString(","))
  }
}
