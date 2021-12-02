package chapter06

object Test06_ConstructerParams {
  def main(args: Array[String]): Unit = {
    val stu2 = new Student2
    println(s"stu2: name = ${stu2.name} age = ${stu2.age}")

    val stu3 = new Student3("Lee", 20)
    println(s"stu3: name = ${stu3.name} age = ${stu3.age}")

    val stu4 = new Student4("Lee", 20)
    stu4.printInfo()

    val stu5 = new Student5("Lee", 20)
    println(s"stu5: name = ${stu5.name} age = ${stu5.age}")

    val stu6 = new Student6("Lee", 20)
    stu6.printInfo()
    val stu7 = new Student6("Lee", 20, "PK")
    stu7.printInfo()
  }
}

// 定义类
// 无参构造器
class Student2 {
  // 单独定义属性
  var name: String = _
  var age: Int = _
}

// 上面定义等价于
class  Student3(var name: String, var age: Int)

// 主构造器参数无修饰
class  Student4(name: String, age: Int){
  def printInfo(): Unit ={
    println(s"stu4: name = ${name} age = ${age}")
  }
}

//class  Student5(_name: String, _age: Int){
//  var name: String = _name
//  var age: Int = _age
//}

class Student5(val name: String, val age: Int)

class Student6(var name: String, var age: Int){
  var school: String = _
  def this(name: String, age: Int, school: String){
    this(name, age)
    this.school = school
  }

  def printInfo(): Unit ={
    println(s"stu6: name = ${name} age = ${age} school = ${school}")
  }
}
