case class Order(item: String, price:Int)

object Main extends App{
  def showOrder(order: Any): String = {
    order match {
      case Order(item, price)
        => "Item: " + item + "\nprice: " + f"$price%,3d yen"
              case _
        => "No member match."
    }
  }

  val tonkatsu = Order("Tonkatsu Teisyoku", 1250)
  val friendShrimp = Order("Fried shrimp Teisyoku", 1370)
  val Order(item, price) = friendShrimp

  println(showOrder(tonkatsu))
  println(showOrder(Order(item ,price)))
}
