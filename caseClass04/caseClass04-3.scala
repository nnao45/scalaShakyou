case class Number(num: Float){
  protected var pi = num
  println(pi)
}

object Main extends App{
  Number(3.14F)
  Number(3.15F)
}
