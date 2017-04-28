import java.util.Calendar

abstract class Duck(val canFly: Boolean = false) {
  def sing(): String
  def nameMe(initials: String): String
  val surname: String
}

class Mallar(canFly: Boolean) extends Duck(canFly) {
  def sing(): String = {
    "I can sing"
  }
  def nameMe(name: String):String = {
    "My name is "+name
  }
  val surname = "Creanga"
}

val myObject = new Mallar(true)
myObject.surname
myObject.sing()
myObject.nameMe("Claudiu")

class Claudiu(var name: String = "Claudiu") {
  def showName() = {
    println("My name is "+name)
  }
}

val obj = new Claudiu()
obj.showName()

class FizzBuzz(val number: Int) {
  val myList: List[Int] = List.range(1, number)

  myList.foreach {
    checkFizzBuzz
  }

  def checkFizzBuzz(x: Int): Unit = {
    if (x % 3 == 0 && x % 5 == 0) println("FizzBuzz")
    else if (x % 3 == 0) println("Fizz")
    else if (x % 5 == 0) println("Buzz")
    else println(x)
  }
}

val game = new FizzBuzz(30)

class next20LeapYears()
{
  val now:Calendar = Calendar.getInstance()

  val currentYear: Int = now.getWeekYear

  val nextLeapYear: Int = (currentYear to currentYear + 4).filter(isLeapYear)(0)

  def isLeapYear(year: Int): Boolean =
  {
    ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)
  }

  val next20LeapYearsResult: List[Int] = List.range(nextLeapYear, nextLeapYear+4*20, 4)

  def getYears: List[Int] = {
    next20LeapYearsResult
  }

}

var leap = new next20LeapYears()
leap.getYears

val myList = List((1,2),(3,4))
myList.unzip

val newList = List.fill(3)(5)
newList