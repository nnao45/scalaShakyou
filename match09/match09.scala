object Main extends App{
  def broherMatch(brother:List[String]): Unit = {
    brother match {
      case List(_, "jiro", _)
        => println("I'm the second from begiing jiro")
      case _
        => println("I'm not the second from begiing jiro")
    }
  }

  broherMatch(List("ichiro", "jiro", "saburo"))
  broherMatch(List("ichiro", "jirou", "jiro"))
}
