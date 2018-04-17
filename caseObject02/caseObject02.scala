sealed abstract class Week

case object Monday  extends Week {
    def show() = {
        "monday"
    }
}
case object Tuesday  extends Week {
    def show() = {
        "tuesday"
    }
}
case object Wednesday extends Week {
    def show() = {
        "wednesday"
    }
}
case object Thursday extends Week {
    def show() = {
        "thursday"
    }
}
case object Friday  extends Week {
    def show() = {
        "friday"
    }
}
case object Saturday  extends Week {
    def show() = {
        "saturday"
    }
}
case object Sunday  extends Week {
    def show() = {
        "sunday"
    }
}

object Main extends App {
    def dayOfTheWeek(week: Week) = {
        week match {
            case Monday     =>  Monday.show()
            case Tuesday    =>  Tuesday.show()
            case Wednesday  =>  Wednesday.show()
            case Thursday   =>  Thursday.show()
            case Friday     =>  Friday.show()
            case Saturday   =>  Saturday.show()
            case Sunday     =>  Sunday.show()
        }
    }
    println(dayOfTheWeek(Monday))
    println(dayOfTheWeek(Thursday))
    println(dayOfTheWeek(Saturday))

}

