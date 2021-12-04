package chapter07

object Test08_ImmutableMap {
  def main(args: Array[String]): Unit = {
     // 1. 创建map
    val map1: Map[String, Int] = Map("a" -> 13, "b" -> 25, "hello" -> 3)
    println(map1)
    println(map1.getClass)

    // 2. 遍历元素
    map1.foreach(println)
    map1.foreach((kv: (String, Int)) => println(kv))
    println("====================================")

    // 3. 访问map中的所有value或key
    for (key <- map1.keySet){
      println(key)
      println(s"$key --> ${map1.get(key)}")
    }
    for (value <- map1.values){
      println(value)
    }

    // 4. 访问某一个key的value
    println(map1.get("a"))
    println(map1.get("a").get)
    println(map1.get("c")) // 没有则报none
    println(map1.getOrElse("c", 0)) // 没有则报0

    println(map1("a"))  // 直接取

  }
}
