package chapter06

object Test04_ClassForAccess {
  def main(args: Array[String]): Unit = {
    // 创建对象
    val person = new Person
    println(person.age)
    println(person.sex)
    person.printInfo
  }

}

// 定义一个父类
class Person {
  private var idCard: String = "0602"
  protected var name: String = "Alice" // 只能在当前类和子类访问，同包无法访问
  var sex: String = "female"
  private[chapter06] var age: Int = 18

  def printInfo = {
    println(s"Person: ${name} ${idCard} ${age} ${sex}")
  }
}
