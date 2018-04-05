class CatMewing(val cry: String) extends AnyVal{
  def mew() {
    println("猫は「" + cry + "」と鳴きます。")
  }
}

object Main extends App{
  val tama = new CatMewing("なお～～～～～～ん")
  tama.mew()
}
