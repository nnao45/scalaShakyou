case class Train(
  fromStation: String,
  toStation: String,
)

object Main extends App{
  var train = Train("函館", "札幌")
  println(train.fromStation + "から" + train.toStation + "まで")
  train = Train("横浜", "東京")
  println(train.fromStation + "から" + train.toStation + "まで")
}
