object Main extends App{
  val taxRate = 0.08F
  def calcConsumptionTax(price: Long) Long = (price * taxRate).toLong

  def display(ConsumptionTax: Long): Unit = println("消費税は " + ConsumptionTax + " 円です。")
  ((calcConsumptionTax _) andThen ())
}
