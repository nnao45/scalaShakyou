object Greeting {
  private val opponent = "世界"

  def greeting(NumberOfTimes: Int) = {
    var i = 0; for(i <- 1 to NumberOfTimes)
      println(i + "回目:" + this.opponent + " の皆さんこんにちは!!")
  }
}

object Main extends App {
  Greeting.greeting(3)
}
