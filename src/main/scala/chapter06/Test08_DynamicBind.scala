package chapter06

// java中的多态是静态绑定属性，动态绑定方法
// scala中的多态是属性和方法都是动态绑定
object Test08_DynamicBind {
  def main(args: Array[String]): Unit = {
    val stu: Person8 = new Student8
    println(stu.name)
    stu.hello()
  }
}

class Person8 {
  val name: String = "person"
  def hello() = {
    println("hello person")
  }
}

class Student8 extends Person8 {
  override val name: String = "student"

  override def hello(): Unit = {
    println("hello student")
  }
}