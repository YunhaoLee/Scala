package chapter06

object Test11_Object {
  def main(args: Array[String]): Unit = {
//    val stu = new Student11("alice", 18)
//    stu.printInfo()
    val stu = Student11.newStudent("alice", 18)
    stu.printInfo()

    val stu2 = Student11.apply("alice", 18)
    stu2.printInfo()

    val stu3 = Student11("alice", 18) // 调用的伴生对象apply方法，apply可省略
    stu3.printInfo()

  }
}

// 定义类
class Student11 private(val name: String, val age: Int){ // 加private将主构造器私有化
  def printInfo(): Unit ={
    println(s"student: name = $name, age = $age, school = ${Student11.school}")
  }
}

// 伴生对象
object Student11{
  val school: String = "atguigu"

  // 定义一个类的对象实例的创建方法
  def newStudent(name: String, age: Int): Student11 = new Student11(name, age)

  def apply(name: String, age: Int): Student11 = new Student11(name, age)
}