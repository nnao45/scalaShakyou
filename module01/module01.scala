class Address{

  def nonArgument = {
    println("引数がありません。")
  }

  def isNotApplicationArguments() = {
    println("都道府県、市町村の指定がありません。")
  }

  def onlyOneArguments(prefectures: String) = {
    println("都道府県は " + prefectures + " です。")
  }

  def pluralArguments
        (prefectures: String, cityTownVillage: String) = {
    println("都道府県は " + prefectures +
            "、市町村は " + cityTownVillage + "です。")
  }
}

object Main extends App {
  val address = new Address()

  address.nonArgument
  address.isNotApplicationArguments()
  address.onlyOneArguments("大阪府")
  address.pluralArguments("大阪府", "堺市")
}
