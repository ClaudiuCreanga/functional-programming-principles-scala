1+1
def da  ={
  "da"
  2 + 2
}
da

{
  2 + 2
}

val imutable: String = "Claudiu"

var mutable: Int = 2

mutable = 6

val character: Char = 'c'

val longString: String =
  """ dasdsa
  dsadasdasd
  """

def threeMultipliedBy(x: Int): Int = {
  3 * x
}

threeMultipliedBy(3)

val result: Int = threeMultipliedBy(6)

def threeMultipliedWIth(x:Int) = 3 * x

threeMultipliedWIth(6)

def justSaying = "No accolades"

val test = (x: Int) => x+1

test.apply(6)
test(6)

def multiplication(x: Int = 2, y:Int = 3) = {
  println("x:" + x + "y" + y)
  x+ y
}'

multiplication(3,4)
multiplication()


// varied length arguments
def showAll(theArgs: Int*) = {
  theArgs.foreach(println)
}

showAll(1,3,4,5)

def multiply(x: Int, y:Int) = {
  x+ y
}

def timeswo = multiply(2, _ :Int)

timeswo(3)


def theMult(x:Int)(y:Int):Int = {
  x * y
}

theMult(2)(3)
var amulti = theMult(2)_
amulti(4)

// variable length arguments
// when you don't know exactly how many arguments you'll have
def showMultiple(theArgs: Int*) = {
  theArgs.foreach(println(_)) // underscore sintactic sugar

  theArgs.foreach((a: Int) => println(a)) // anonyomous function in foreach
}

showMultiple(1,2,3,4,5,6)