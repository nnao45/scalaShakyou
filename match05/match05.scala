object Main extends App{
  final val HitNumber = 777

  def numberRocket(betNumber: Int): String = {
    betNumber match {
      case HitNumber
        =>  "「" + HitNumber + "」は当たりです。"
      case somethingElseNumber
        => "「" + somethingElseNumber + "」は外れです。"
      case _
        => "内部エラーです。"
    }
  }

  println(numberRocket(99))
  println(numberRocket(777))
  println(numberRocket(111111))
}
