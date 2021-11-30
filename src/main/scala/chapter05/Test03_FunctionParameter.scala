package chapter05

object Test03_FunctionParameter {
  def main(args: Array[String]): Unit = {
    // 1）可变参数
    def f1(str: String*): Unit = {
      println(str)
    }

    f1("alice")
    f1("alice", "lee", "ccc")

    // 2）如果参数列表中存在多个参数，那么可变参数一般放置在最后
    def f2(str1: String, str2: String*): Unit = {
      println(str1 + ", " + str2)
    }
    f2("alice")
    f2("alice", "aaa", "bbb")

    // 3）参数默认值，一般将有默认值的参数放置在参数列表的后面
    def f3(str: String, name: String = "Lee"): Unit = {
      println(str + ", " + "my name is" + name)
    }
    f3("aaaa")

    // 4）带名参数
    def f4(name: String, age: Int): Unit = {
      println(s"${age}岁${name}")
    }
    f4("alic", 20)
    f4(age = 20, name = "alic")
  }
}
