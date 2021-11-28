package chapter01

class Student(name: String, var age: Int) {
  def printInfo(): Unit = {
    println(name + " " + age + " " + Student.school)
  }
}

// 引入伴生对象
object Student{
  val school: String = "atguigu"

  def main(args: Array[String]): Unit = {
    val lee = new Student("lee", 20)
    val bob = new Student("bob", 22)

    lee.printInfo()
    bob.printInfo()
  }
}