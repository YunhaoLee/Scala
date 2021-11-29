package chapter03

object Test01_TestOperator {
  def main(args: Array[String]): Unit = {
    // 1.算术运算符
    val res1 = 10 / 3
    println(res1)

    val res2:Double = 10 / 3
    println(res2)

    val res3:Double = 10.0 / 3
    println(res3)
    println(res3.formatted("%3.2f")) // 3表示至少有几个有效数字，.2表示小数点后保留几位

    val res4 = 10 % 3
    println(res4)

    // 2.比较运算符
    val s1: String = "hello"
    val s2: String = new String("hello")
    println(s1 == s2)
    println(s1.equals(s2))
    println(s1.eq(s2)) // 判断引用地址是否相同
    println("==================================")

    // 3.逻辑运算符
    def m(n: Int): Int = {
      println("m被调用")
      return n
    }

    val n = 1
    println((4 > 5) && (m(n) > 0))
    println((4 < 5) && (m(n) > 0))
    println((4 > 5) & (m(n) > 0)) // 按位与

    println("==================================")
    def isNotEmpty(s: String): Boolean = {
//      return !(s == "") // s为null的时候会报空指针异常
      return s != null && !("".equals(s.trim))
    }
    println(isNotEmpty(null))

    // 4.赋值运算符
    var b: Int = 10
    b += 1
    println(b)

    // 5. 位运算符
    val a = 60
    println(a << 3)
    println(a >> 2)
    println(a >>> 2)

    val b1: Short = -13
    println(b1 << 2)
    println(b1 >> 2)
    println(b1 >>> 2)

    // 6. 运算符的本质
    val n1 = 12
    val n2 = 27
    println(n1 + n2)
    println(n1.+ (n2))

    println(1.34.* (25))
    println(1.34 * 25)

    println(7.5 toString) // .可省略
    println(7.5 toInt)
  }
}
