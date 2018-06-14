class Employee {
    private val re = """([A-Z]+)""".r // 正規表現
    private var name_ :String = _ // _はその型に応じたデフォルト値

    def name = name_
    def name_= (value:String) {
        name_ = value match {
            case re(v) => v // 正規表現でパターンマッチし、該当した値を取得しmatch式の戻り値として返す。
            case _ => throw new IllegalArgumentException
      } // match式の戻り値をname_ に代入
    }
}

object Main extends App {
    val e = new Employee
    e.name = "KATO" // 大文字だからOK
    println(e.name) // KATO
    e.name = "Kato" // IllegalArgumentExceptionがすっ飛びます！
    println(e.name) // Kato
}