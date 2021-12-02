package chapter06

object Test12_Singleton {
  def main(args: Array[String]): Unit = {
    val stu1 = Student12.getInstance()
    stu1.printInfo()
    val stu2 = Student12.getInstance()
    stu2.printInfo()

    println(stu1)
    println(stu2)
  }
}

// 定义类
class Student12 private(val name: String, val age: Int){ // 加private将主构造器私有化
  def printInfo(): Unit ={
    println(s"student: name = $name, age = $age, school = ${Student11.school}")
  }
}

// 饿汉式单例设计模式
/*object Student12{
  private val stu: Student12 = new Student12("alice", 18)
  def getInstance(): Student12 = stu
}*/

// 懒汉式单例设计模式
object Student12{
  private var stu: Student12 = _
  def getInstance(): Student12 = {
    if (stu == null) {
      stu = new Student12("alice", 18)
    }
    stu
  }
}