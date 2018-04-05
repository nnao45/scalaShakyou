case class CommuterPass(
  from: String,
  to:   String,
)

object Main extends App{
  val CP1 = CommuterPass("渋谷", "新宿")
  println("定期券1:" + CP1.toString())

  val CP2 = CommuterPass("田町", "目黒")
  println("定期券2:" + CP2.toString())

  println(CommuterPass("センター北", "センター南").toString())
  println(CommuterPass("大井町", "旗の台"))
}
