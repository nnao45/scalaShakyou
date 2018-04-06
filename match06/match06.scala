object Main extends App{
  def accountsTitle(account: String): String = {
    account match {
      case acc @ ("A" | "B" | "C")
        => acc + "-> AorBorC"
      case acc @ ("D" | "E" | "F" | "G")
        => acc + "-> DorEorForG"
      case _
        => "overH"
    }
  }

  println(accountsTitle("A"))
  println(accountsTitle("F"))
  println(accountsTitle("X"))
}
