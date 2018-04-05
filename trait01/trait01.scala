trait CatName extends Any {
  def showName() {
    println("猫の名前は「たま吉」です。")
  }
}

class CatMewing(val cry: String) extends AnyVal with CatName {
  def mew() {
      println("猫は「" + cry + "」と鳴きます。")
  }
}

object Main extends App {
  val tamakichi = new CatMewing("なお～～～～～～ん")
  tamakichi.mew()
  tamakichi.showName()
}
