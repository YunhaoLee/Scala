package chapter02

import chapter01.Student

object Test07_DataType {
  def main(args: Array[String]): Unit = {
    // 1.整数类型
    val a1:Byte = 127
    val a2:Byte = -128

    // 整数默认类型为Int
    val a3:Byte = 12
    val a4 = 12345678909876L //长整数值定义最后必须要加L

    val b1: Byte = 10
    val b2: Byte = 10 + 20

    val b3 = b1 + 20
    println(b3)
    val b4 = (b1 + 20).toByte
    println(b4)

    // 2.浮点类型
    val f1 = 1.234
    val f2: Float = 1.234f // 定义float类型在最后加f

    // 3.字符类型
    val c1: Char = 'a'
    println(c1)

    val c2 = '9'
    println(c2)

    val c3 = '\t' // 制表符
    val c4 = '\n' // 换行符
    println("abc" + c3 + "def")
    println("abc" + c4 + "def")
    println("abc" + '\\' + "def")
    println("abc" + '\"' + "def")

    // 字符变量底层保存ASCII码
    val i1: Int = c1
    println("i1: " + i1)
    val i2: Int = c2
    println("i2: " + i2)

    val c5 = (i1 + 1).toChar
    println(c5)
    val c6 = (i2 + 1).toChar
    println(c6)

    // 4.布尔类型
    val isRes1 = false
    val isRes2 = true

    // 5.空类型
    // 5.1 空值Unit
    def m1(): Unit = {
      println("m1被调用执行")
    }

    val a = m1()
    println("a: " + a)  // Unit只有一个实例--()

    // 5.2 空引用Null，可赋值给任意引用类型，但是不能赋值给值类型
    val n = null
    var student = new Student("lee", 20)
    student = null
    println(student)

    // 5.3 Nothing，可以作为没有正常返回值的方法的返回类型，直接表示这个方法不会正常返回
//    def m2(n: Int): Int = {
//      if(n == 0)
//        throw new NullPointerException
//      else
//        return n
//    }
//
//    val n2 = m2(0)
//    println(n2)
  }
}
