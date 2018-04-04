object Main extends App {
  def omitBracket(university: String, department: String): String = {
      "私は " + university + " の " + department + "を卒業しました。"
  }

  println(omitBracket("青山学院大学", "経済学部"))
}
