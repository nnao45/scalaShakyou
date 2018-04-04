case class PersonInfo(
  fullName: String,
  birthplace: String,
  age:  Int,
)

object Main extends App{
  val person = PersonInfo("鳩山　英輝", "新潟県", 25)

  val PersonInfo(fullName, birthplace, age) = person

  println("ようこそ！" + age + "才の" + fullName + "さん")
  println(birthplace + "のご出身ですね！")
}
