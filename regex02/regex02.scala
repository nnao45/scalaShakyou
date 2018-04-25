object Main extends App {
    def calcSum(numList: List[Int]): Int = {
        numList match {
            case (head::tail)
                => head + calcSum(tail)
            case (Nil)
                => 0
        }
    }
    println( "7 + 236 + 34 + 4567 + " + calcSum(7::236::34::4567::Nil))
}