class Greeting(yourName: String){
  println(yourName + " さんこんにちはー！")

  def this() {
    this("名無し")
    println("\tお名前を教えて下さい")
  }

  def this(yourName: String, myName: String){
    this(yourName)
    println("\t私の名前は " + myName + " です。")
  }
}

object Main extends App{
  val greeting1 = new Greeting()
  val greeting2 = new Greeting("津崎")
  val greeting3 = new Greeting("新垣", "星野")
}
