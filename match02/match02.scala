abstract class Number()

case class IntNumber(
  num1: Int,
  num2: Int,
) extends Number

case class FloatNumber(
  num1: Float,
  num2: Float,
) extends Number

object Main extends App{
  def printNumber(num: Number) {
    num match {
      case IntNumber(num1, num2) =>
        println(num1 + " x " + num2 + " = " + num1 * num2)
      case FloatNumber(num1, num2) =>
        println(num1 + " x " + num2 + " = " + num1 * num2)
      case _ =>
    }
  }

  val intNum = IntNumber(22, 77)
  printNumber(intNum)
  val floatNum = FloatNumber(123.2F, 77.9F)
  printNumber(floatNum)
}
