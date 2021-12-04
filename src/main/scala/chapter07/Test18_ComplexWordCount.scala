package chapter07

object Test18_ComplexWordCount {
  def main(args: Array[String]): Unit = {

    val strList = List(
      ("hello", 1),
      ("hello world", 2),
      ("hello scala", 3),
      ("hello spark from scala", 1),
      ("hello flink from scala", 2)
    )

    // 思路一：直接展开为普通版本
    val newStrList = strList.map(
      kv => {
        (kv._1.trim + " ") * kv._2
      }
    )
    println(newStrList)

    // 接下来操作与普通版本一致
    val countStrList = newStrList
      .flatMap(_.split(" "))
      .groupBy(word => word)
      .map(kv => (kv._1, kv._2.length))
      .toList
      .sortBy(_._2)(Ordering[Int].reverse)
      .take(3)

    println(countStrList)

    // 思路二：直接基于预统计的解雇哦进行转换
    // 1. 将字符串打散为单词，并结合对应的个数包装成二元组
    val preCountList = strList.flatMap(
      tuple => {
        val strings = tuple._1.split(" ")
        strings.map(word => (word, tuple._2))
      }
    )
    println(preCountList)

    // 2. 对二元组按照单词进行分组
    val preCountMap = preCountList.groupBy(_._1)
    println(preCountMap)

    // 3. 叠加每个单词预统计的个数值
    val countMap = preCountMap.mapValues(
      tupleList => tupleList.map(_._2).sum
    )
    println(countMap)

    // 4. 转换为List，排序取前3
    val countList = countMap
      .toList
      .sortWith(_._2 > _._2)
      .take(3)
    println(countList)
  }
}
