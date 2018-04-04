object BMI {
  def judge(height: Float, weight: Float): Unit = {
    val fatness = weight / Math.pow(height/100, 2)

    val judgement = if(fatness < 18.5f)             "低体重"
    else if(18.5f <= fatness && fatness < 25.0f)   "普通体重"
    else if(25.0f <= fatness && fatness < 30.0f)   "肥満1"
    else if(30.0f <= fatness && fatness < 35.0f)   "肥満2"
    else if(35.0f <= fatness && fatness < 40.0f)   "肥満3"
    else                                           "肥満4"

    println("あなたのBMI判定は・・・「" + judgement + "」です！")
  }
}

object Main extends App {
  BMI.judge(171.0f, 85.7f)
  BMI.judge(155.5f, 45.5f)
  BMI.judge(171.0f, 185.7f)
  BMI.judge(160.0f, 46.0f)
}


