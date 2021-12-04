package chapter07

object Test17_CommonWordCount {
  def main(args: Array[String]): Unit = {
    val strList = List(
      "hello",
      "hello world",
      "hello scala",
      "hello spark from scala",
      "hello flink from scala"
    )

    // 1. 对字符串进行切分
//    val wordList1 = strList.map(_.split(" ")).flatten
//    println(wordList1)

    val wordList2 = strList.flatMap(_.split(" "))
    println(wordList2)

    // 2. 将相同单词进行分组
    val groupMap = wordList2.groupBy(word => word)
    println(groupMap)

    // 3. 对分组之后的List取长度，得到每个单词的个数
    val countMap = groupMap.map(kv => (kv._1, kv._2.length))

    // 4. 将map转换为List，并排序取前3
    val sortList = countMap.toList.sortWith(_._2 > _._2).take(3)
    println(sortList)
  }
}
