class KinderGarten private (className: String, pupilName: String, age: Int) {
  override def toString =
    "★%s 組★%s ちゃん★%d 才".format(className, pupilName, age)
}

object KinderGarten {
  def apply(className: String, pupilName: String, age: Int) =
    new KinderGarten(className, pupilName, age)
}

object Main extends App {
  println(KinderGarten("さくら","久保田　渚",4))
  val kg = KinderGarten("さざんか","明石　莉音",5)
  println(kg)
}
