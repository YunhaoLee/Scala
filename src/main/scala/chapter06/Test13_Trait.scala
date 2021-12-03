package chapter06

object Test13_Trait {
  def main(args: Array[String]): Unit = {
    val stu = new Student13
    stu.sayHello()
    stu.dating()
    stu.study()
    stu.play()
  }
}

// 定义一个父类
class Person13 {
  val name = "Lee"
  var age = 13
  def sayHello(): Unit ={
    println("hello from " + name)
  }
  def increase() = {
    println("person is increased")
  }
}

// 定义一个特质
trait Young {
  // 声明抽象和非抽象属性
  var age: Int
  val name = "young"

  // 声明抽象和非抽象方法
  def play() = {
    println(s"young people $name is playing")
  }
  def dating(): Unit

}

class Student13 extends Person13 with Young {
  // 重写冲突的属性
  override val name: String = "stu"

  // 实现抽象方法
  def dating(): Unit = {
    println(s"stu $name is dating")
  }

  def study(): Unit = {
    println(s"stu $name is studing")
  }

  // 重写父类方法
  override def sayHello(): Unit ={
    println("hello from stu: " + name)
  }
}
