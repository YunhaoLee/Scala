package chapter06

object Test05_Constructer {
  def main(args: Array[String]): Unit = {
    val stu1 = new Student1()
    println("=========================")
    stu1.Student1()
    println("=========================")
    val stu2 = new Student1("Lee")
    println("=========================")
    val stu3 = new Student1("Lee", 20)

  }
}

// 定义一个类
class Student1 {
  // 定义属性
  var name: String = _
  var age: Int = _

  println("1. 主构造方法")

  // 声明辅助构造方法
  def this(name: String){
    this() // 直接调用主构造器
    println("2. 辅助构造方法一")
    this.name = name
    println(s"name: $name age: $age")
  }

  def this(name: String, age: Int) {
    this(name)
    println("3. 辅助构造方法二")
    this.age = age
    println(s"name: $name age: $age")
  }

  def Student1() = {
    println("不是构造方法被调用，而是一般方法")
  }
}
