object Main extends App {
  def greet(schoolName: String)(humanName: String, greeting: String): String =
    schoolName + "の" + humanName + "ちゃん！" + greeting

  val schoolNameFixingGreet = greet("歴史小学校")_

  println(schoolNameFixingGreet("清少納言", "さようなら！"))
}
