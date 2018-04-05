case object FullName{
  val firstName = "洋子"
  val secondName = "萩野目"
}

object Main extends App{
  println(FullName.secondName + " " + FullName.firstName)
}
