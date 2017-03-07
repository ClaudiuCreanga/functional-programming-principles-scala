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

  def pascalBuild(x: Int) =
    
  println("3 \n 5"+4)
}
