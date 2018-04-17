case class FullName(firstName: String, lastName: String)
case class Employee(id: Int, name: FullName)

object Main extends App{
  def employeeInfo(employee: Employee): String = {
    employee match {
      case Employee(id, name)
        => name match {
            case FullName(firstName, lastName)
              => "ID: " + id + "\nlast: " + lastName + "\nfirst: " + firstName
            case _
              => "No name match."
        }
      case _
        => "No member match."
    }
  }

  val empl = Employee(id = 3311677, name = FullName("Hiroyuki", "Kashiwagi"))

  println(employeeInfo(empl))
}
