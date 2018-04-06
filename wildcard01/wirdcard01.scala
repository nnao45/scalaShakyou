object Main extends App{
  def decisionString(anyValue: Any): String = {
    anyValue match {
      case str: String
        => str + "は文字列です。"
      case _
        => "文字列ではありません。"
    }
  }

  println(decisionString( List(13, 14, 15, 16)))
  println("hello!")
  println(decisionString(3.14F))
}
