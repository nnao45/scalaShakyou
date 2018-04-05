case class Weather(
  region: String,
  temperture: Float,
  humidity: Float,
  rainyPercent: Int,
)

object Main extends App{
  val weatherTulpled = Weather.tupled

  val tayamaData = ("富山県", 20.2F, 45.5F, 20)

  val weatherTayama = weatherTulpled(tayamaData)

  weatherTayama.productIterator foreach(println)
}
