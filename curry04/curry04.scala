case class PersonInfo(
  firstName:  String,
  secondName: String,
  address:    String,
  age:        Int,
  idNo:       String,
) 

object Main extends App{
  val curriedPerson = PersonInfo.curried
  val functionPerson = curriedPerson("柳澤")("真一")("滋賀県草津市野路町")

  val person1 = functionPerson(21)("4582-11-2")

  person1.productIterator foreach(println)
}
