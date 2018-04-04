object Main extends App {
  val calcMulti:(Int, Int) => Long = (
    (x: Int, y: Int) => {x * y}: Long
  )

  println(
    "77000 x 77 = " + "%,3d".format(calcMulti(77000, 77))
  )

  ((x: Int, y: Int) =>
    {println(x + " x " + y + " = " + "%,3d".format(x * y))}
  )(99999, 10000)
}
