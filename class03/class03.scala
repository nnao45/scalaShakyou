class APrinter() {
    def print(): Unit = {
    println("A")
  }
}
class BPrinter() extends APrinter {
    override def print(): Unit = {
    println("B")
  }
}

object Main extends App {
    new APrinter().print
    new BPrinter().print
}