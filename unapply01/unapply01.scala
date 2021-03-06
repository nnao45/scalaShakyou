class Student(
  val name: String,
  val schoolyear: Int,
  val schoolclass: String,
  val age: Int,
)

object  Student {
  def apply(name:  String, schoolyear: Int, schoolclass: String, age: Int): Student =
    new Student(name, schoolyear, schoolclass, age)

  def unapply(student: Student) =
    Some(student.name, student.schoolyear, student.schoolclass, student.age)
}

object Main extends App {
  val student = Student("一条", 2, "C組", 20)

  val consistency = student match {
    case Student(name, schoolyear, schoolclass, age) =>
      println("生徒名 = %s, 学年 = %s年生, 学級 = %s, 年齢 = %s才".format(name, schoolyear, schoolclass, age))
    case _ =>
      println("一致しませんでした。")
  }
}
