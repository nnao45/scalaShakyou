object Main extends App {
  import java.util.HashMap
  import scala.collection.JavaConversions._

  val hsetColor = new HashMap[Int, String]
  hsetColor.put(1, "Orange")
  hsetColor.put(2, "Green")
  hsetColor.put(3, "Red")

  hsetColor.foreach {
    case (no, color) => println(no + ":" + color)
  }
}
