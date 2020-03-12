package lectures.part2oop

object Inheritance extends App {

  //single class inheritance
  class Animal {
    val creatureType = "Wild"
     def eat = println("nomnom")
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch")
    }
  }
    //val cat = new cat
   //cat.crunch

  //Constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  //Overrinding
  class Dog(override val creatureType: String) extends Animal{
    override def eat = {
      super.eat
      println("Crunch Crunch")
    }
  }
  val dog = new Dog("K9")
  dog.eat
  println(dog.creatureType);

  //Type substitution (broad: polymorphism)
  val unknowAnimal: Animal =new Dog("K9")
  unknowAnimal.eat

  //preventing overrides
  // 1 - use final on member
  // 2 - use final on the entire class
  // 3 - seal the class =  extend classes in THIS FILE, prevent extension in other files


}
