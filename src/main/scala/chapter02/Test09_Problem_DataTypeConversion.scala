package chapter02

/*
  128: Int类型，占据4个字节，32位
    原码：0000 0000 0000 0000 0000 0000 1000 0000
    补码：0000 0000 0000 0000 0000 0000 1000 0000
    截取最后一个字节转换为Byte
    得到补码：1000 0000 (除第一位符号位其他位取反)-> 1111 1111 （+1）-> 1000 0000
    表示的最大的负数 -128
  130: Int类型，占据4个字节，32位
    原码：0000 0000 0000 0000 0000 0000 1000 0010
    补码：0000 0000 0000 0000 0000 0000 1000 0010 （正数的补码不变）
    截取最后一个字节转换为Byte
    得到补码：1000 0010 (除第一位符号位其他位取反)-> 1111 1101 （+1）-> 1111 1110
    表示 -126
 */
object Test09_Problem_DataTypeConversion {
  def main(args: Array[String]): Unit = {
    val n = 128
    val b = n.toByte
    println(b)
  }
}