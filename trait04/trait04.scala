trait Subject {
    def numberOftimeAweek(name: String): Int
}

class PrimarySchool extends Subject {
    override def numberOftimeAweek(name: String): Int = {
        name match {
            case "math" 
                => 5
            case "japanese"
                => 6
            case "science"
                => 4
            case "society"
                => 4
            case _
                => 0 
        }
    }
}

object Main extends App {
    val subject = new PrimarySchool()
    println("count of promary school class in a week")
    println("[math] = " + subject. numberOftimeAweek("math"))
}