object Main extends App {
  def numPatern(number: (Int, String)): String = {
    number match {
      case(1, _ )
        =>  "ichi"
      case(2, _ )
        =>  "ni"
      case(3, _ )
        =>  "san"
      case(4, numberStr )
        =>  numberStr
      case(10, _ )
        =>  "ju"
      case(numberInt, _ )
        =>  numberInt.toString
      case _ => "something"
    }
  }

  println(numPatern(1, "san"))
  println(numPatern(4, "yon"))
  println(numPatern(10, "ju"))
  println(numPatern(22, "nijuni"))
  println(numPatern(null, "null"))
}
