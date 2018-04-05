sealed trait FullName {
  def firstName: String
  def lastName:  String
}

private case class NameImpl (
  firstName: String,
  lastName:  String,
) extends FullName {
  println(lastName + " " + firstName)
}

object FullName {
  def apply(firstName: String, lastName:  String):FullName = {
    NameImpl(firstName, lastName)
  }
}

object Main extends App{
  //FullName.apply("純一", "鈴木")
  FullName("純一", "鈴木")
}
