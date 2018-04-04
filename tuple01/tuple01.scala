object Main extends App {
  val fruit = List( "バナナ", "みかん", "いちご", "マンゴー")

  def getMaxShelfNoFruit(fruit: List[String]) = {
    val last = fruit.last
    val shelfNo = fruit.indexOf(last)
    (last, shelfNo)
  }

  val maxShelfNoFruit = getMaxShelfNoFruit(fruit)

  println("・最大棚番号の果物:" + maxShelfNoFruit._1 )
  println("・棚番号:" + maxShelfNoFruit._2 )

}
