package chapter05

object Test07_Practice_CollectionOperation {
  def main(args: Array[String]): Unit = {

    val arr = Array(12, 45, 75, 98)

    // 对数组进行处理，将操作抽象出来，处理完毕之后的解雇哦返回一个新的数组
    def arrayOp(arr: Array[Int], op: Int=>Int) = {
      for (elem <- arr) yield op(elem)
    }

    // 定义一个加一操作
    def addOne(elem: Int): Int = {
      elem + 1
    }

    // 调用函数
    val newArray: Array[Int] = arrayOp(arr, addOne)
    newArray.foreach(println)
    println(newArray.mkString(","))

    // 传入匿名函数，实现元素翻倍
    val newArray2 = arrayOp(arr, _ * 2)
    println(newArray2.mkString(","))
  }
}
