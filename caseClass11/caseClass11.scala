case class MemberID(
  firstName:  String,
  secondName: String,
  address:    String,
  age:        Int,
  sex:        String,
)

object Main extends App{
  var member1 = MemberID(
                  "高橋",
                  "彩花",
                  "千葉県",
                  40,
                  "女",
                )

  println("case class: " + member1.productPrefix)
  println("args(filed)数: " + member1.productArity)
  println("third args: " + member1.productElement(2))
  println("number list of args: ")
  member1.productIterator foreach println
}
