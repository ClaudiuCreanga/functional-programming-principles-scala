package example

/**
  * Created by Claudiu on 09/02/2017.
  */
object Example extends App{
  println("Hello World")
  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)

  def isGoodEnough (guess: Double, x: Double): Boolean =
    abs(guess * guess - x) < 0.001

  def improve(guess: Double, x: Double): Double =
    (guess + x / guess) / 2
}
