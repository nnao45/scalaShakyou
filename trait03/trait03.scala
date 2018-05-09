trait Greeting {
    val name: String
    val message: String
    lazy val synthesis = name + " san, " + message
}

class EveningGreeting extends Greeting {
    val name = "Kaori Tachibana"
    val message = "hello!!" 
    println(synthesis)
}

object Main extends App {
    new EveningGreeting().synthesis
}