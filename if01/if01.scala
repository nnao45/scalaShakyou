object IfExamples {
  def main(args: Array[String]): Unit = {
    val inputString = if (args.isEmpty) notEntered else wasInput(args(0))
  }

  def notEntered = println( "何も入力されませんでした。")
  def wasInput(input:String) = println("入力された文字は「" + input + "」です。")
}
