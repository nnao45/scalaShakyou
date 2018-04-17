case class BusinessPartner(fullName: String, company: String, price: Int)
case class Company(name: String, member: Int, stock: Int)

object Main extends App{
  def outBpInformation(bp: Any): String = {
    bp match {
      case BusinessPartner(_, "Brain,inc.", _)
        => "Brain,inc's member."
      case BusinessPartner(fullName, company, price)
        => "<member's information>" + fullName + company + f"$price%,3d yen"
      case _
        => "No match format."
    }
  }

  val michiko = BusinessPartner("Hukutomi Michiko", "Brain,inc.", 8090000)
  val yusuke = BusinessPartner("Nakaawa Yusuke", "Micro system,inc.", 850000)
  val poke = Company("Nakaawa Yusuke", 151500, 850000)

  println(outBpInformation(michiko))
  println(outBpInformation(yusuke))
  println(outBpInformation(poke))
}
