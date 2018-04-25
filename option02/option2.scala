object Main extends App {
    def getWatchword(watchword: Option[String]) = {
        watchword match {
            case Some(watchword) => watchword
            case None => "Disagreement"
        }
    }

    val watchword: Option[String] = Some("open the sesami")
    println(getWatchword(watchword))
    println(getWatchword(None))
}
