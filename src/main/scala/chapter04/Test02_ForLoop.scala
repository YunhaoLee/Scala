package chapter04

object Test02_ForLoop {
  def main(args: Array[String]): Unit = {
    // java for语法： for(int i = 0; i < 10; i ++) {System.out.println("hello world")}

    // 1.范围遍历（to 包含末尾）
    for (i <- 1 to 10){
      println(i + ": hello world")
    }
    println("=====================")

    for (i <- 1.to (10)){
      println(i + ": hello world")
    }

    // 默认的range不会包含末尾
    for (i <- Range(1, 10)){
      println(i)
    }
    for (i <- 1 until 10){
      println(i)
    }
    println("=====================")

    // 2. 集合遍历
    for (i <- Array(12, 34, 53)){
      println(i)
    }

    for (i <- List(12, 34, 53)){
      println(i)
    }

    for (i <- Set(12, 34, 53)){
      println(i)
    }

    // 只有当i！=2的时候才进行后续操作，否则continue
    for (i <- 1 to 3 if i != 2){
      print(i + " ")
    }
    println("")

    // 4. 循环步长（by指定步长）
    for (i <- 1 to 10 by 2){
      println(i)
    }

    for (i <- 30 to 13 by -2){
      println(i)
    }

    println("-----------------")
    for (i <- 1 to 10 reverse){
      println(i)
    }

    println("-----------------")
    for  (i <- 1.0 to 10.0 by 0.5){
      println(i)
    }

    // 5. 循环嵌套
    for (i <- 1 to 3){
      for (j <- 1 to 3){
        println("i = " + i + ", j = " + j)
      }
    }

    println("-----------------")
    for (i <- 1 to 3; j <- 1 to 5){
      println("i = " + i + ", j = " + j)
    }

    // 6. 循环引入变量
    println("-----------------")
    for(i <- 1 to 10){
      val j = 10 - i
      println("i = " + i + ", j = " + j)
    }

    println("-----------------")
    for(i <- 1 to 10; j = 10 - i){
      println("i = " + i + ", j = " + j)
    }

    println("-----------------")
    for {
      i <- 1 to 10
      j = 10 - i
    }{
      println("i = " + i + ", j = " + j)
    }

    // 7. 循环返回值
    val a = for (i <- 1 to 10){
      println(i)
    }
    println("a = " + a)

    val b = for (i <- 1 to 10) yield i
    println("b = " + b)

    val c = for (i <- 1 to 10) yield i * i
    println("c = " + c)

    //
  }
}
