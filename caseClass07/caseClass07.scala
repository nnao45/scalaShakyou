case class Human(name: String)

object Main extends App{
  val human1 = Human("Alice")
  val human2 = Human("Android No.3")
  val human3 = Human("Alice")
  
  if(human1.equals(human2)) {
    println(human1 + "= " + human2)
  } else {
    println(human1 + "≠" + human2)
  }

  if(human1.equals(human3)) {
    println(human1 + "= " + human3)
  } else {
    println(human1 + "≠" + human3)
  }
}
