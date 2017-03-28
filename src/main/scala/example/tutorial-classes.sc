class Duck

class Muck(val name: String, val nickName: String) {
  println("Inside the constructor")
  val color: String = if (name == "Duc") "red"
                      else "yellow"
  def canSing = {
    if (name == "Duc") "I can squa"
    else "mute"
  }

  val anonim = {
    () => "A string: " + name
  }
}

val theDuck = new Muck("Duc", "Ducky")
println(theDuck.color)
println(theDuck.nickName)
println(theDuck.canSing)
println(theDuck.anonim())

