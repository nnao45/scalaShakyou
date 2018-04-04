object Main extends App {
  implicit val greeting = "こんにちは！"
  implicit def convertFromIntegerToString(intergerNumber: Int) = "数字の " + intergerNumber.toString + " です。"

  def tellMessage(implicit inWords: String) = "みなさん！ " + inWords

  println(tellMessage("お元気ですか？"))
  println(tellMessage)
  println(tellMessage(7777))
}
