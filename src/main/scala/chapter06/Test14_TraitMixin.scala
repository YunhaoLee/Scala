package chapter06

object Test14_TraitMixin {
  def main(args: Array[String]): Unit = {
    val stu = new Student14
    stu.study()
    stu.increase()

    stu.play()
    stu.increase()

    stu.dating()
    stu.increase()

    println("======================================")
    // 动态混入
    val studentWithTalent = new Student14 with Talent {
      override def singing(): Unit = {
        println(s"stu $name is singing")
      }

      override def dancing(): Unit = {
        println(s"stu $name is dancing")
      }
    }

    studentWithTalent.sayHello()
    studentWithTalent.singing()
    studentWithTalent.dating()
    studentWithTalent.dancing()
  }
}

// 再定义一个特质
trait Knowledge {
  var amount: Int = 0
  def increase(): Unit
}

trait Talent {
  def singing(): Unit
  def dancing(): Unit
}

class Student14 extends Person13 with Young with Knowledge {
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

  override def increase(): Unit = {
    amount += 1
    println(s"student $name knowledge amount $amount")
  }
}
