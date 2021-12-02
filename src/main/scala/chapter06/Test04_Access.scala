package chapter06

object Test04_Access {
  def main(args: Array[String]): Unit = {
    // 创建对象
    val person = new Person
    println(person.age)
    println(person.sex)
    person.printInfo
    val worker = new Worker
    worker.printInfo

  }
}

// 定义一个子类
class Worker extends Person {
  override def printInfo: Unit = {
    println(s"Worker: $name $age $sex")
    name = "Bob"
    age = 22
    sex = "male"
    println(s"Worker: $name $age $sex")
  }
}
