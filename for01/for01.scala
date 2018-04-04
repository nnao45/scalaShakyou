object Main extends App {
  def sumFrom1toTargetNumber(targetNum: Int) = {
    var (i, sum) = (1, 0)
    for (i <- 1 to targetNum) sum += i
    sum
  }

  println("1~10までの総和 = " + sumFrom1toTargetNumber(10))
}
