package lectures.part1basics

object CBNvsCBV extends App{

  def calledByValue(x: Long) : Unit = {
    println("by value:" + x)
    println("by value:" + x)
  }

  def calledByName(x: => Long) : Unit = {
    println("by name:" + x)
    println("by name:" + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  def infinitive(): Int = 1 + infinitive()
  def printFirst(x: Int, y: => Int) = println(x)

  //printFirst(infinitive(), 34)
  printFirst(34, infinitive())

  /*Takeaways
  Call By Value:
  -Value is computed before call
  -Same value used everywhere

  Call By Name:
  -Expression is passed literally
  -Expression is evaluated at every use within
  */

}
