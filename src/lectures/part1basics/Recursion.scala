package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int) : Int =
    if(n <= 1) 1
  else{
      println("Computing factorial of "+n+" - I first need factorial of " + (n-1))
      val result = n* factorial(n-1)
      println("Computed factorial of" + n)
      result
    }
     println(factorial(10))
    //println(factorial((50000)))

  def anotherFactorial(n: Int) : BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt) : BigInt =
      if(x<=1) accumulator
      else factHelper(x-1, x*accumulator) //TAIL RECURSION = use recursive call as the last expression
    factHelper(n,1)


  }
    println(anotherFactorial(5000))

  // WHEN YOU NEED LOOPS, USE _TAIL_RECURSION

  /*
   1. Concatenate a string n times
   2. IsPrime function tail recursive
   3. Fibonnacci function, tail recursive
   */

   def concatenateTailrec(aString: String, n:Int, accumulator: String): String =
     if(n<=0) accumulator
     else concatenateTailrec(aString, n-1, aString + accumulator)
     println(concatenateTailrec("hello", 3, ""));

   def isPrime(n: Int) :Boolean = {
     @tailrec
     def isPrimeTailRec(t: Int, isStillPrime: Boolean) : Boolean =
       if(!isStillPrime) false
       else if (t<=1) true
       else isPrimeTailRec(t-1, n % t != 0 && isStillPrime)
      isPrimeTailRec(n /2, true)

   }
   println(isPrime(2003))
   println(isPrime(629))

   def fibonacci(n: Int) : Int = {
     def fiboTailREc(i: Int, last: Int, nextToLast: Int): Int =
       if(i >=n) last
       else fiboTailREc(i + 1, last + nextToLast , last)

     if(n<=2) 1
     else fiboTailREc( 2, 1, 1)

   }
  println(fibonacci(8))
}

