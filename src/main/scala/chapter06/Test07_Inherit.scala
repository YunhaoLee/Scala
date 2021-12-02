package chapter06

object Test07_Inherit {
  def main(args: Array[String]): Unit = {
    val stu1 = new Student7("Lee", 20)
    stu1.printInfo()
    println("================================================")

    val stu2 = new Student7("Lee", 20, "Z19070019")
    stu2.printInfo()
    println("================================================")

    val teacher = new Teacher
    teacher.printInfo()
    println("================================================")

    def personInfo(person: Person7): Unit ={
      person.printInfo()
    }

    val person = new Person7()
    personInfo(stu1)
    personInfo(teacher)
    personInfo(person)
  }
}

// 定义一个父类
class Person7() {
  var name: String = _
  var age: Int = _
  println("1. 父类的主构造器被调用")

  def this(name: String, age: Int) {
    this()
    println("2. 父类的辅助构造器调用")
    this.name = name
    this.age = age
  }

  def printInfo(): Unit ={
    println(s"Person: $name $age")
  }
}

// 定义一个子类(如果父类主构造器有参数，以下两都得写参数)
class Student7(name: String, age: Int) extends Person7 {

  println("3. 子类的主构造器被调用")
  var stu_num: String = _

  def this(name: String, age: Int, stu_num: String){
    this(name, age)
    println("4. 子类的辅助构造器被调用")
    this.stu_num = stu_num
  }

  override def printInfo(): Unit ={
    println(s"Stu: $name $age $stu_num")
  }
}


class Teacher extends Person7 {
  override def printInfo(): Unit = {
    println("Teacher")
  }
}