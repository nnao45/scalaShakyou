object Main extends App {

  def larger(int1: Int, int2: Int): Int = {
    if(int1 > int2) int1 else int2
  }

  def larger(double1: Double, double2: Double): Double = {
    if(double1 > double2) double1 else double2
  }

  def larger(str1: String, str2: String): String = {
    if(str1.length() > str2.length()) str1 else str2
  }

  println("大きい方は" + larger(87464521, 5457451) + "です。")
  println("大きい方は" + larger(7.77d, 7.79d) + "です。")
  println("大きい方は" + larger("あひゃああああ", "ぼぶみみみみみみみっっっっっっみ") + "です。")
}
