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

val myObject = new Mallar()
myObject.surname
myObject.sing()
myObject.nameMe("Claudiu")