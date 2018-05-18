trait Number {
    def number(): Int
}

trait LuckyNumberTanaka extends Number {
    override def number(): Int = 777
}

trait LuckyNumberSuzuki extends Number {
    override def number(): Int = 77777
}

class LuckyNumber extends LuckyNumberTanaka with LuckyNumberSuzuki {
    println("lucky number is " + number() + ".")
}

object Main extends App {
    new LuckyNumber()
}