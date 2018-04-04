object Main extends App {
  val combiningLiteral: ( String, Int, String) => String =
    (item: String, number: Int, unit: String) => {
    item + " は " + number + unit + " です。"
    }: String

  println(combiningLiteral("年齢", 6, "才"))
}
