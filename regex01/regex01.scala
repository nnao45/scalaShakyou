object Main extends App {
    val dateSlash = "%tY/%<tm/%<td" format new java.util.Date
    val dateBar = "%tY-%<tm-%<td" format new java.util.Date
 
    val DateRegex = "(\\d\\d\\d\\d)/(\\d\\d)/(\\d\\d)".r 
        dateSlash match {
            case DateRegex(year, month, day) 
            => println(year + "/" + month + "/" + day)
            case _
            => println("Unmatch!")
        }

    val dateRegex1 = """(\d\d\d\d)/(\d\d)/(\d\d)""".r 
        dateSlash match {
            case dateRegex1(year, month, day) 
            => println(year + "/" + month + "/" + day)
            case _
            => println("Unmatch!")
        }

    val dateRegex2 = raw"(\d\d\d\d)/(\d\d)/(\d\d)".r 
        dateSlash match {
            case dateRegex2(year, month, day) 
            => println(year + "/" + month + "/" + day)
            case _
            => println("Unmatch!")
        }

//    val dateRegex3 = raw"(\d\d\d\d)/(\d\d)/(\d\d)".r = {
  //      dateSlash match {
    //        case dateRegex3(year, month, day) 
      //      => println(year + "/" + month + "/" + day)
        //    case _
          //  => println("Unmatch!")
        //}
    //}
}