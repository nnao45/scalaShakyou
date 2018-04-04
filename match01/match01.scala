object Main extends App {
  def judge(anyType: Any): String = {
    anyType match {
      case int      : Int         =>  s"$int      =>  Intクラス型"
      case float    : Float       =>  s"$float    =>  Floatクラス型"
      case string   : String      =>  s"$string   =>  Stringクラス型"
      case array    : Array[Int]  =>  s"${array.mkString(",")}  =>  Arrayクラス型"
      case list     : List[_]     =>  s"$list     =>  Listクラス型"
      case book     : Book        =>  s"${book.name}  =>  Bookクラス型"
      case _                      =>  "予期せぬ型"
    }
  }

  println(judge(435324))
  println(judge(3.14159f))
  println(judge("hey,yoooooo!!"))
  println(judge(Array(100, 200, 300)))
  println(judge(List("赤", "青", "緑")))
  case class Book(name: String)
  println(judge(Book("基礎からわかるScala")))
}
