object Main extends App {
    val xmlTag1 =
        <students>
            <name>Kondou Hideki</name><classNo>1-C</classNo>
        </students>

    val xmlTag2 =
        <students>
            <name>Kondou Hideki</name><classNo>1-C</classNo>
            <name>Ran Iwasaki</name><classNo>1-B</classNo>
            <name>Junko Kashiwabara</name><classNo>1-A</classNo>
        </students>

    xmlTag1 match {
        case
            <students>
                <name>{name}</name><classNo>{classNo}</classNo>
            </students>
                => println(name + "::" + classNo)
        case _
                =>
    }


    xmlTag2 match {
        case
            <students>{students @ _*}</students>
                => {
                    students foreach {
                        element
                            => println(element.text)
                    }
                }
        case _
                =>
    }

}