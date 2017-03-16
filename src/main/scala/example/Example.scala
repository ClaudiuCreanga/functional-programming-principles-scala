package example

import math._
/**
  * Created by Claudiu on 09/02/2017.
  */
object Example extends App{

  def sqrt(x: Double) = {
    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double): Boolean =
      abs(guess * guess - x) < 0.001

    def improve(guess: Double): Double =
      (guess + x / guess) / 2

    sqrtIter(1.0)
  }
  println(sqrt(4))

  def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

  println(gcd(14, 21))

  def tailRecursiveFactorial(n: Int): Int = {
    def loop(acc: Int, n: Int): Int =
      if (n==0) acc
      else loop(acc * n, n-1)
    loop(1, n)
  }

  println(tailRecursiveFactorial(4))

  def pascal(c: Int, r: Int): Int = (c,r) match {
    case (0, _) => 1
    case (`c`, `r`) if c == r => 1
    case (`c`, `r`) => pascal(c, r-1)+pascal(c-1,r-1)
  }

  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }

  def newpascal(c: Int, r:Int): Int =
    if (c == 0 || c == r) 1
    else newpascal(c-1, r-1) + newpascal(c, r-1)

  def parenthesesBalancing(chars: List[Char]): Boolean =
    true

  println(matchTest(3))
  println(pascal(2,3))
  println(newpascal(2,3))
  println(parenthesesBalancing("I told him (that it’s not (yet) done). (But he wasn’t listening)".toList))

}
