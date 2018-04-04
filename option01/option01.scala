object Main extends App {
  val keepAsPet = Map("first" -> "dog",
                      "second" -> "cat",
                      "third" -> "humsater",
    )
  def search(pet: Option[String]) {
    pet match {
      case Some(name) =>
        println("飼っているペットは " + name + "です。")
      case None =>
        println("そんなペットは飼っていません。")
    }
  }

  search(keepAsPet.get("first"))
  search(keepAsPet.get("forth"))
}
