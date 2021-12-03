package chapter07

import scala.collection.mutable.ArrayBuffer

object Test02_ArrayBuffer {
  def main(args: Array[String]): Unit = {
    // 1. 创建可变数组
    val arr1 = new ArrayBuffer[Int]()
    val arr2 = ArrayBuffer(12, 13, 14)

    println(arr1.mkString(","))
    println(arr2.mkString(","))
    println(arr2.toString())
    println(arr2) // 调用的toString方法

    // 2. 访问元素
    println(arr2(0))
    arr2(0) = 2
    println(arr2(0))
    println("=======================")

    // 3. 增加元素
    val arr1_1 = arr1 :+ 1
    println(arr1_1)
    println(arr1_1 == arr1)

    // 在后面追加
    arr1 += 2
    println(arr1)
    val arr1_2 = arr1 += 3
    println(arr1_2)
    println(arr1) // 两个指向同一地址所以会一起改变
    println(arr1_2 == arr1)

    // 在前面追加
    7 +=: arr1
    println(arr1)

    // 可变数组可用append方法
    arr1.append(2)
    arr1.prepend(11, 76)
    println(arr1)

    arr1.insert(0, 14, 99) // 第一位表示插入地址
    println(arr1)

    arr1.insertAll(0, arr1_1) // 在指定位置插入一个数组
    arr1.prependAll(arr1_1)
    println(arr1)

    // 4. 删除元素
    arr1.remove(1)  // 删除指定位置的元素
    println(arr1)

    arr1.remove(1,2)  // 从指定位置删指定数量元素
    println(arr1)

    arr1 -= 11  // 删除指定元素（有就删，没有就不删）
    println(arr1)

    // 5. 可变数组转换为不可变数组
    val arr = ArrayBuffer(23, 34, 45)
    val new_arr = arr.toArray
    println(new_arr.mkString(","))
    println(arr)

    // 6. 不可变数组转换为可变数组
    val buffer = new_arr.toBuffer
    println(buffer)
    println(new_arr)
  }
}
