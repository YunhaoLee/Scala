package chapter06

import scala.beans.BeanProperty

object Test03_Class {
  def main(args: Array[String]): Unit = {
    val stu = new Student()
    println(stu.age)
    println(stu.sex)
    stu.age = 111
    stu.sex = "female"
    println(stu.age)
    println(stu.sex)
  }
}

// 定义一个类
class Student {
  // 定义属性
  private var name: String = "alice"
  @BeanProperty
  var age: Int = _
  var sex: String = _
}