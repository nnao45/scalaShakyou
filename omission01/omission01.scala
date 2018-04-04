object Main extends App {
  def basic(name: String, greeting: String): String = {
    name + " さん、" + greeting + "!!"
  }

  def omit(name: String, greeting: String){
    println(name + " さん、" + greeting + "!!")
  }

  println(basic("林　三郎", "お願い致します。"))
  omit("小原　庄助", "踊って下さい。")
}
