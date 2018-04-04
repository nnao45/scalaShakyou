class Prefecture(val name: String, val pCap: String, val pop: Int){
  var registerPrefecture: (Prefecture) => Unit =
    (prefecture: Prefecture) => println(prefecture + " ※付加情報未登録")

  def displayPrefecture() = registerPrefecture(this)

  override def toString
    = "▼都道府県 名前 = " + name +
      " 県庁所在地 = " + pCap +
      " 人口 = " + pop
}

object Main extends App {
  val niigata = new Prefecture("新潟県","新潟市",807450)
  niigata.displayPrefecture()
  niigata.registerPrefecture = (prefecture: Prefecture) =>
    println("付加情報: 市の木は「ヤナギ」です")
  niigata.displayPrefecture()
}
