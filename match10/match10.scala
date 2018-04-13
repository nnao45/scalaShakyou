object Main extends App{
  def printVideo(video:Any): Unit = {
    video match {
      case (no, title, genre)
        => println("No: %d, title: %s, genre: %s".format(no, title, genre))
      case _
        => println("No match format.")
    }
  }

  printVideo(123231, "jiro", "saburo")
  printVideo(42342, "jirou", "jiro", "peso")
  printVideo(42342)
}
