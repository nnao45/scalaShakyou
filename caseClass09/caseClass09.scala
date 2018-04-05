import java.util.Date

case class Android(
  model:    String,
  product:  Date,
)

object Main extends App{
  val mono = Android("MONO", new Date())
  val pono = mono.copy(model = "pono")

  printf("%s : %tF 製造\n", pono.model, pono.product)
}
