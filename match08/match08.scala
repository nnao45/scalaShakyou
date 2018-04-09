object Main extends App{
  def printContents(anyVal: Any): Unit = {
    anyVal match {
      case str: String
        => println("String型:" + str)
      case flt: Float
        => println("Float型:" + flt)
      case map: Map[_, _]
        => println("Map型:" ); map.foreach(print)
    }
  }

  printContents("源氏物語")
  printContents(2.71828F)
  printContents(Map(1->"ichi", 2->"ni", 3->"san"))
}
