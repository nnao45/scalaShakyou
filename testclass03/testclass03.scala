class Greeting(name: String){
  println("はじめまして！" + name + "さん！")
}

object Main extends App {
  val aClass = new Greeting("山田")
}
