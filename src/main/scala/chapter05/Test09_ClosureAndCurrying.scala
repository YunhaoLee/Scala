package chapter05

object Test09_ClosureAndCurrying {
  def main(args: Array[String]): Unit = {
    def add(a: Int, b: Int): Int = {
      a + b
    }

    // 1. 考虑固定一个加数的场景
    def addByFour(b: Int): Int = {
      4 + b
    }

    // 2. 扩展固定加数改变的情况
    def addByFive(b: Int): Int = {
      5 + b
    }

    // 3. 将固定加数作为另一个参数传入，但是是作为第一层参数传入
    def addByFour1(): Int => Int = {
      val a = 4

      def addB(b: Int): Int = {
        a + b
      }

      addB
    }


    def addByA(a: Int): Int => Int = {
      def addB(b: Int): Int = {
        a + b
      }
      addB
    }

    println(addByFour1()(1))
    println(addByA(4)(24))

    val addByFour2 = addByA(4)
    val addByFive2 = addByA(5)
    println(addByFour2(10))
    println(addByFive2(15))

    // 4. lambda表达式简写
    def addByA1(a: Int): Int => Int = {
      b => a + b
    }

    def addByA2(a: Int): Int => Int = a + _

    val addByFour3 = addByA2(4)
    val addByFive3 = addByA2(5)
    println(addByFour3(10))
    println(addByFive3(15))

    // 5. 柯里化
    def addCurrying(a: Int)(b: Int): Int = {
      a + b
    }
    println(addCurrying(1)(2))
  }
}
