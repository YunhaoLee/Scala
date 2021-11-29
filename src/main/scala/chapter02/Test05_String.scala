package chapter02

object Test05_String {
  def main(args: Array[String]): Unit = {
    // 1) 字符串，通过+号连接
    val name = "alice"
    val age = 18
    println(age + "岁的" + name + "在尚硅谷学习")

    // *用于将一个字符串复制多次并拼接
    println(name * 3)

    // 2) printf用法：字符串，通过%传值。
    printf("i am %s, %d year old", name, age)
    println()

    // 3）字符串模板(插值字符串): 通过$获取变量值(前面要有s)
    println(s"$name is $age year old")

    val num1 = 2.3456
    val num2 = 2.3456f
    println(s"$num1")
    println(f"${num1}%2.2f") // 格式化模板字符串
    println(raw"${num1}%2.2f") // 填入变量信息后其他全部按照原始样式输出

    // 三引号表示字符串，保持多行字符串的原格式输出
    val sql = s"""
       |select *
       |from
       |  student
       |where
       |  name = ${name}
       |and
       |  age > ${age}
       |""".stripMargin
    println(sql)
  }
}
