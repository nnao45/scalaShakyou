class Number(num: Float){
  protected var pi = num
  println(pi)
}

object Number{
  def apply(num: Float) {
    new Number(num)
  }
}

object Main extends App{
  Number(3.14F)
}
