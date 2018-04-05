case class FullName(
  firstName: String,
  secondName: String,
)

object Main extends App{
  var fullName = FullName("賢治", "高橋")
  val fn = FullName("賢治", "高橋")

  println("姓名:" + fullName.secondName + fullName.firstName)
  println("姓名:" + fn.secondName + fn.firstName)

  //fullName.secondName = "大森"
}
