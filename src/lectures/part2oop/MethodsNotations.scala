package lectures.part2oop

object MethodsNotations extends App {

  class Person(val name: String, favoriteMovie: String, val age: Int = 0){
    def likes(movie: String): Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(nickname: String): Person = new Person(s"$name ($nickname)", favoriteMovie)
    def unary_! : String = s"$name, what the heck?"
    def unary_+ : Person = new Person(name,favoriteMovie, age + 1)
    def isAlive: Boolean = true
    def apply() : String = s"Hi, my name is $name and I like $favoriteMovie"
    def apply(n : Int): String = s"$name  watched $favoriteMovie $n times"
    def learns(thing: String) = s"$name is learning $thing"
    def learnScala = this learns "Scala"

  }
     val mary = new Person("Mary","Inception")
     println(mary.likes("Inception"))
     println(mary likes "Inception")  // both are equivalent
     // infix notation = operator notation (SYNTACTI SUGAR)

     // "operators" in scala
      val tom = new Person("Tom","Fight Club")
      println(mary + tom)
      println(mary.+(tom))

      println(1 + 2)
      println(1.+(2))

     // ALL OPERATORS ARE METHODS
     // Akka actors have ! ?

    // prefix notation
    val x = -1 // equivalent with 1.unary_-
    val y = 1.unary_-
   // unary_prefix only works with - + ~ !

   println(!mary)
   println(mary.unary_!)

   // post fix notation
   println(mary.isAlive)
  println(mary isAlive)

  //apply
  println(mary.apply())
  println(mary()) // equivalent

  //Exercises
  println((mary + "Rockstars").apply())
  println((+mary).age)
  println(mary learnScala)
  println(mary(10))
}
