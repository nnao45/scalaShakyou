class Person(name: String, age: Int, private val weight: Int)

object Person {
    def printWeight(): Unit = {
        val taro = new Person("Taro", 20, 70)
    println(taro.weight)
  }
}

object Main extends App {
    Person.printWeight
}