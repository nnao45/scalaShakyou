case class Stock(
  brand: String,
  stockPrice: Int,
)

object Main extends App{
  println("コンパニオンオブジェクト名:" + Stock.toString())
  println("コンパニオンオブジェクト名:" + Stock)
}
