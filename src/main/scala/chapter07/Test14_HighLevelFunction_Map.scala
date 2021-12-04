package chapter07

object Test14_HighLevelFunction_Map {
  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3, 4, 5, 6, 7, 8)
    // 1. 过滤
    // 选取偶数
    println(list.filter((elem: Int) => {elem % 2 == 0}))
    println(list.filter(_ % 2 == 0))

    // 选取奇数
    println(list.filter(_ % 2 == 1))
    println("==================================")

    // 2. map
    // 把集合中每个数×2
    println(list.map(_ * 2))
    println(list.map(elem => elem * elem))
    println("==================================")

    // 3. 扁平化
    val nestedList = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))
    val flatList = nestedList(0) ::: nestedList(1) ::: nestedList(2)
    println(flatList)
    val flatList2 = nestedList.flatten
    println(flatList2)
    println("======================================")

    // 4. 扁平映射
    // 将一组字符串进行分词，并保存成单词的列表
    val strs = List("hello world", "hello scala", "hello java", "we study")
    println(strs.map(_.split(" ")).flatten) // 打散扁平化
    println(strs.flatMap(_.split(" ")))     // 内部传split操作
    println("======================================")

    // 5. 分组groupBy
    // 分成奇偶两组
    val groupMap = list.groupBy(_ % 2)
    println(groupMap)
    val groupMap2 = list.groupBy(
      data => {
        if (data % 2 == 0) "偶数"
        else "奇数"
      }
    )
    println(groupMap2)

    // 给定一组词汇，按照单词的首字母进行分组
    val wordList = List("china", "america", "alice", "canada", "cary", "bob", "japan")
    println(wordList.groupBy(_.charAt(0)))
  }
}
