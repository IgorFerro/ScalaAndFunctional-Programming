package lectures.part2oop

object Objects extends App{

  // SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY (static)
  object Person {
    // "static"/"class" - level functionality
    val N_EYES = 2
    def canFly: Boolean = false

    // factory method
    def apply(mother: Person, father: Person) : Person = new Person("Bobbie")
  }
  class Person(val name:String) {
    // instance=level functionality
  }
  //COMPANIONS

   println(Person.N_EYES)
   println(Person.canFly)

  // Scala object = SINGLETON INSTANCE
  val mary = new Person("Mary")
  val john = new Person("John")
  println(mary == john)

  val person1 = Person
  val person2 = Person
  println(person1==person2)

  val bobbie = Person.apply(mary, john)

  //Scala Applications = Scala object with
  // def main(args: Array[String]) : Unit

  //Takeaways
  //Scala doesn't have "static" values/methods

  /*
    Scala Objects
    *are in their own class
    *are the only instance
    *singleton pattern in one line

    Scala companions
    *can acess each other's private members
    *Scala is more OO than Java!

    *Scala applications

  */


}
