object Main extends App{
  def track(trackNo: Int): String = {
    trackNo match {
      case 0
        => "aka"
      case 2 | 3
        => "ao"
      case 4 | 5 | 6 | 7
        => "midori"
      case 8 | 9 | 10
        => "kuro"
      case 30
        => "siro"
    }
  }

  println(track(0))
  println(track(2))
  println(track(7))
  println(track(9))
}
