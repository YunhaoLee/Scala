//package chapter06
//
//object Test02_PackageObject {
//  def main(args: Array[String]): Unit = {
//    commonMehod()
//    println(commonValue)
//  }
//}

package chapter06 {
  object Test02_PackageObject {
    def main(args: Array[String]): Unit = {
      commonMehod()
      println(commonValue)
    }
  }
}

package ccc{
  package ddd{
    object Test02_PackageObject{
      def main(args: Array[String]): Unit = {
        println(school)
        println(school2)
      }
    }
  }
  package object ddd{
    val school2: String = "Lee2"
  }
}

package object ccc{
  val school: String = "Lee"
}
