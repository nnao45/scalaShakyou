object Main extends App{
  def greet(schoolName: String)(humanName: String): String =
    schoolName + "の" + humanName + "ちゃん！" + "はじめまして！"

  val schoolNameFixingGreet = greet("歴史小学校")_

  println(schoolNameFixingGreet("小野　小町"))
}
