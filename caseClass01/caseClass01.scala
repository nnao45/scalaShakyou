case class MailGreeting(
  sender: String,
  receiver: String,
  message: String,
)

object Main extends App{
  var mg = MailGreeting(
            "Honoko@akito.co.jp",
            "Taro@akito.co.jp",
            "Hello, My Sunshine.",
           )
  var mg2 = MailGreeting(
            "Honoko@akito.co.jp",
            "Taro@akito.co.jp",
            "Goodbye, My Sunshine.",
           )

  println(mg.message)
  println(mg2.message)
}
