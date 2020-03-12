package lectures.part2oop

object AbstractDataTypes extends App {

  // abstract
  abstract class Animal {
    val creatureType: String
    def eat: Unit

  }
  class Dog extends Animal {
    override val creatureType: String = "Canine"
    def eat: Unit = println("Crunch Crunch")
  }
  // Traits
  trait Carnivore {
    def eat(animal: Animal) : Unit
  }

  class Crocodile extends Animal with Carnivore {
   val creatureType: String = "croc"
    def eat: Unit =println("nomnomnom")
    def eat (animal: Animal): Unit = println(s"I'm a croc I'm eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

  //traits vs Abstract classes
  //1- traits do not have constructor parameters
  //2- multiple traits may be inherited by same class
  //3- traits = behavior, abstract class =thing
}
