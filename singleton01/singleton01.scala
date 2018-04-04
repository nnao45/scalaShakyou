object Factorial {
  val power: Double = 5
  def sayMessage(): String = {
    return power + "乗 = "
  }
}


class Factorial {
  private var baseNum: Double = 0

  def setBaseNum(num: Double):  Unit = {
    baseNum = num
  }


  def calcFactorial(): Double = {
    return Math.pow(baseNum, Factorial.power)
  }
}

object main extends App {
  print("7の " + Factorial.sayMessage())
  var fact = new Factorial()
  fact.setBaseNum(7)
  println(fact.calcFactorial())
}

