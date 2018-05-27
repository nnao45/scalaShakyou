class Adder {
    def add(x: Int)(y: Int): Int = x + y
}

object Main extends App {
    val adder = new Adder()
    println(adder.add(2)(3))

    val fun = adder.add(2) _
    println(fun(3))
}