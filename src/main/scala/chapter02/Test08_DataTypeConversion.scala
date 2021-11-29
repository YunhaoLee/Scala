package chapter02

object Test08_DataTypeConversion {
  def main(args: Array[String]): Unit = {
    // 一、自动类型转换
    // 1) 自动提升原则：有多种类型的数据混合运算时，系统首先 自动将所有数据转换成精度大的那种数据类型 ，然后再进行计算。
    val a1: Byte = 10
    val b1: Long = 2552L
    val res1 = (a1 + b1)
    val res2 = (a1 + b1.toInt)

    // 2) 把精度大的数值类型赋值给精度小的数值类型时，就会报错 ，反之就会进行自动类型转换。
    val a2: Byte = 10
    val b2: Int = a2
    val c2: Byte = b2.toByte

    // 3) (byte, short)和char之间不会相互自动转换。
    val a3: Byte = 10
    val b3: Char = 'b'
    val c3: Byte = b3.toByte
    println(c3)

    // 4) byte, short, char三者之间可以计算， 在计算时首先需要转换为int类型。
    val a4: Byte = 12
    val b4: Short = 24
    val c4: Char = 'c'
    val res4: Int = a4 + b4
    val res5 = a4 + b4 + c4
    println(res4)
    println(res5)

    // 二、强制类型转换
    // 1）将数据由高精度转换为低精度，就需要使用到强制转换
    val n1: Int = 2.6.toInt // 无论正负都是取整数部分
    println(n1)

    // 2）强转符号只针对于最近的操作数有效，往往会使用小括号提升优先级
    val n2: Int = (2.6 + 3.7).toInt
    println(n2)

    // 三、数值类型和String类型的转换
    // 1）数值转String
    val n = 27
    val s = n + ""
    println(s)

    // 2) String转换为数值
    val m= "12".toInt
    val f1 = "12.3".toFloat
    val f2 = "12.3".toDouble.toInt
  }
}
