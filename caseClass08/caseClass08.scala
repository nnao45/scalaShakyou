case class Human(name: String)
case class Animal(name: String)

object Main extends App{
  val human1 = Human("Alice")
  val animal1 = Animal("Mugi")
  val human2 = Human("Bob")

  println(human1 + " と " + animal1 + " は")

  if(human1.canEqual(animal1)) {
    println("同じケースクラスから生成されています。")
  } else {
    println("違うケースクラスから生成されています。")
  }

  println(human1 + " と " + animal1 + " は")

  if(Human("Popumi").canEqual(Human("Pipimi"))) {
    println("同じケースクラスから生成されています。")
  } else {
    println("違うケースクラスから生成されています。")
  }
}
