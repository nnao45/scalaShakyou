class Animal(val name: String, val cry: String)

object Animal{
    def unapply(animal: Animal): Option[(String, String)] = {
        Option((animal.name, animal.cry))
    }
}

object Main extends App{
  def animalCry(animal: Animal) = {
    animal match {
      case Animal(name, cry)
        => println(name + " cry \"" + cry + "\".")
      case _
        => "No match format."
    }
  }

  val ducks = new Animal("duck", "ga-ga-")
  animalCry(ducks)
  animalCry(new Animal("beef", "mo-mo-"))
}
