object Main extends App{
  def stringCombineDefinition(
    string1: String, string2: String): String =
      string1 + " " + string2

  val stringCombineDefFunc1 = stringCombineDefinition _
  val stringCombineDefFunc2: (String, String) => String = stringCombineDefinition

  println(stringCombineDefFunc1("私の名前は", "音無雄一郎です"))
  println(stringCombineDefFunc2("東京都", "文京区"))
}
