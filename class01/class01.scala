class Point(val x: Int, val y: Int) {
  def plus(p: Point): Point = {
    new Point(x + p.x, y + p.y)
  }
  override def toString(): String = "(" + x + ", " + y + ")"
}

object Main extends App {
    val p1 = new Point(1, 2)
    val p2 = new Point(2, 2)
    print(p1.plus(p2) + "\n")
}