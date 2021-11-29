package chapter04

import scala.io.StdIn

object Test01_IfElse {
  def main(args: Array[String]): Unit = {
    println("请输入年龄： ")
    val age = StdIn.readInt()

    // 1. 单分支
    if (age >= 18) {
      println("成年")
    }

    // 双分支
    if (age >= 18) {
      println("成年")
    } else {
      println("未成年")
    }

    // 多分支
    if (age <= 6) {
      println("童年")
    } else if (age < 18){
      println("青少年")
    } else if (age < 35) {
      println("青年")
    } else {
      println("老年")
    }

    // 分支语句的返回值
    val res =  if (age <= 6) {
      println("童年")
    } else if (age < 18){
      println("青少年")
    } else if (age < 35) {
      println("青年")
    } else {
      println("老年")
    }
    println("res: " + res)

    val res1: Any =  if (age <= 6) {
      println("童年")
      "童年"
    } else if (age < 18){
      println("青少年")
      "青少年"
    } else if (age < 35) {
      println("青年")
      age
    } else {
      println("老年")
      age
    }
    println("res1: " + res1)

    // java的三元运算符 a ? b : c
    val res2: String = if (age >= 18) "成年" else "未成年"
    println(res2)
    println("===========================================")

    // 5. 嵌套分支
    if (age >= 18) {
      println("成年")
      if (age >= 35) {
        if (age >= 60) {
          println("老年")
        } else {
          println("中年")
        }
      } else {
        println("青年")
      }
    } else {
      println("未成年")
    }
  }
}
