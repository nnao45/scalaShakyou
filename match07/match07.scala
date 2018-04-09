object Main extends App{
  def heightReq(height: Int): String = {
    val message = height match {
      case cm if (100 < cm) && (cm <= 120)
        => "「ミニコースター」に乗れるよ！"
      case cm if (cm > 120)
        => "「スカイコースター」に乗れるよ！"
      case _
       => "出直してきな。"
    }

    return "身長" + height + "センチの君は" + message
  }

  println(heightReq(135))
  println(heightReq(115))
  println(heightReq(95))
}
