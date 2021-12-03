package chapter06

object Test15_TraitOverlying {
  def main(args: Array[String]): Unit = {
    val stu = new Student15
    stu.increase()

    // 钻石问题特征叠加
    val myFootBall = new myFootBall
    println(myFootBall.describe())
  }

}

// 再定义一个特质
trait Knowledge15 {
  var amount: Int = 0
  def increase() = {
    println("knowledge is increased")
  }
}

trait Talent15 {
  def singing(): Unit
  def dancing(): Unit
  def increase() = {
    println("talent is increased")
  }
}

class Student15 extends Person13 with Talent15 with Knowledge15 {
  override def singing(): Unit = {
    println("singing")
  }

  override def dancing(): Unit = {
    println("dancing")
  }

  override def increase(): Unit = {
    super[Person13].increase()
  }
}

// 定义球类特征
trait Ball {
  def describe(): String = "ball"
}

// 定义颜色特征
trait ColorBall extends Ball {
  var color: String = "red"
  override def describe(): String = color + "-" + super.describe()
}

// 定义种类特征
trait CategoryBall extends Ball {
  var category: String = "foot"
  override def describe(): String = category + "-" + super.describe()
}

// 定义一个自定义球的类
class myFootBall extends CategoryBall with ColorBall {
  override def describe(): String = "my ball is a" + "-" + super.describe()
}