package chapter06

object Test16_TriatSelfType {
  def main(args: Array[String]): Unit = {
    val user = new RegisterUser("Lee", "123456")
    user.insert()
  }
}

// 定义一个用户类
class User(val name: String, val password: String)

trait UserDao{
  _: User =>

  // 向数据库插入数据
  def insert() = {
    println(s"insert into db: $name")
  }
}

// 定义一个注册用户子类
class RegisterUser(name: String, password: String) extends User(name, password) with UserDao