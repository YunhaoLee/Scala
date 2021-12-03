package chapter06

object Test17_Extends {
  def main(args: Array[String]): Unit = {
    // 1. 类型的检测和转换
    val stu = new Student17("lee", 20)
    stu.sayHi()
    stu.study()

    val person: Person17 = new Student17("bob", 22)
    person.sayHi() // 没法调用study函数

    // 类型判断
    println("stu is Student17:" + stu.isInstanceOf[Student17])
    println("stu is Person17:" + stu.isInstanceOf[Person17])
    println("person is Student17:" + person.isInstanceOf[Student17])
    println("person is Person17:" + person.isInstanceOf[Person17])

    val person2: Person17 = new Person17("cary", 35)
    println("person2 is Student17:" + person2.isInstanceOf[Student17])
    println("person2 is Person17:" + person2.isInstanceOf[Person17])

    // 类型转换
    if (person.isInstanceOf[Student17]){
      val newStu = person.asInstanceOf[Student17]
      newStu.study()
    }
    println(classOf[Student17])

    // 2. 测试枚举类
    println(WorkDay.MONDAY)
    println(WorkDay.TUESDAY)
  }
}

class Person17(val name: String, val age: Int){
  def sayHi() = {
    println("hi from person " + name)
  }
}

class Student17(name: String, age: Int) extends Person17(name, age){
  override def sayHi(): Unit = {
    println("hi from student " + name)
  }

  def study() = {
    println("studing")
  }
}

// 定义枚举类对象
object WorkDay extends Enumeration {
  val MONDAY = Value(1, "Monday")
  val TUESDAY = Value(2, "Tuesday")
}

object TestApp extends App {
  println("app start")

  type MyString = String
  val a: MyString = "abc"
  println(a)
}