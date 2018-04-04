object Main extends App {
  val chinese = Map(1->"one", 2->"two", 3->"three")

  //chinese.foreach(println)

  chinese.foreach {
    case (key,value) => print(key + ":" + value + ", ")
    case _ => print("")
  }
}
