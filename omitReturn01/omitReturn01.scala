object Main extends App {
  def omitReturn(name: String, greeting: String) = {
    name + " さん" + greeting + "!"
  }
  println(omitReturn("青木　隆", "おはようございます。"))

  def omitReturnAndBracket(name: String, greeting: String) =
    name + " さん" + greeting + "!"

  println(omitReturnAndBracket("福富　美智子", "ありがとうございます。"))

  def nonReturnValue(name: String, greeting: String) = {
    println(name + " さん" + greeting + "!")
  }
  nonReturnValue("中川　智史", "ようこそいらっしゃいました。")

  def nonReturnValueAndEqual(name: String, greeting: String) {
    println(name + " さん" + greeting + "!")
  }
  nonReturnValueAndEqual("中川　智史", "ようこそいらっしゃいました。")

}
