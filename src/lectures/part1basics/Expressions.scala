package lectures.part1basics

object Expressions extends App{

  val x = 1 + 2 //EXPRESSION
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1 ==x))
  // ! && ||

  var aVariable =2
  aVariable += 3 // also works with -= *= /= ..... side effects
  println(aVariable)

  //Instructions (DO) vs Expressions (VALUE)

  //IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // IF EXPRESSSION
  println(aConditionedValue)
  println(if(aCondition)5 else 3)

  var i = 0
  while (i<10){
    println(i)
    i+= 1
  } // NEVER WRITE THIS AGAIN

   // EVERYTHING in Scala is an Expression!
   val aWeirdValue = (aVariable = 3) // Unit ===void
  println(aWeirdValue);

  //side effects: println(), whiles, reassigning

  //code blocks

  val aCodeBlock = {
    val y = 2
    val z= y+1

    if (z>2) "hello" else "goodbye"
  }
  //Taleaways

  // IF in Scala is an expression
  //Code Blocks in Scala are expressions(The value of the block is the value of its last expression)
  //Expressions Vs Instructions(Instructions(do something) are executaded(think java), expressions(give me the value of something) are evaluated(scala))
}
