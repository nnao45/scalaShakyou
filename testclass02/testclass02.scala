class Greeting( val name: String, var greeting: String) {
  println(name, "　さん！　" + greeting)

  def this( greeting: String ) = this( "三軒家", greeting )
  def this() = this( "こんばんわ" )
}

object Main extends App {
  var greet1 = new Greeting("田中" , "さようなら" )
  var greet2 = new Greeting("おはようございます" )
  var greet3 = new Greeting()
}
