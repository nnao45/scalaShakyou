object Main extends App {
  def sum(t: Int): Int = {
    var (i, sum)  = (1, 0)
    while(i <= t){
    sum += i
    i += 1
    }
    sum
  }


  println("1~10までの総和 = " + sum(10))
}
