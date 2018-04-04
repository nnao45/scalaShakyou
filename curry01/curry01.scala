object Main extends App {
  def greet(schoolName: String, humanName: String): Unit =
    println(schoolName + "の" + humanName + "ちゃん！こんにちは！")

  greet("千葉市立千葉小学校", "鈴木　里衣奈")

  val schoolNameFixingGreet = greet(schoolName = "歴史小学校", _:String)

  schoolNameFixingGreet("明智　光秀")
  schoolNameFixingGreet("紫　式部")
}
