object Main extends App {

  def dateIndication(year: Int = 2017, month: Int = 1, day: Int = 1) =
    println("%04d年%02d月%02d日".format(year, month, day))

  dateIndication()
  dateIndication(day = 7)
  dateIndication(month = 7, day = 7)
  dateIndication(year = 2018, month = 7, day = 7)
}
