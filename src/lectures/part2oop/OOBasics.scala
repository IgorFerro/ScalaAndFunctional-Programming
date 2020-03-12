package lectures.part2oop

object OOBasics extends App {

  val person = new Person ( "John", 26 )
  println ( person.x )
  person.greet ( "Igor" )
  person.greet ()

  val author = new Writer("Igor","Ferro", 1983)
  val imposter = new Writer("Igor","Ferro", 1983)
  val novel = new Novel("Great Exprectations", 1861, author )

  println(novel.authorAge)
  println(novel.isWrittenBy(imposter))

  val counter = new Counter
  counter.inc.print
  counter.inc.inc.inc.print
  counter.inc(10).print


}
//Constructor
class Person(name: String, val age: Int = 0) {
   // body
  val x = 2

  println(1 + 3)

  // method
  def greet(name: String) : Unit = println(s"${this.name} says: Hi $name")
 // overloading
  def greet(): Unit = println(s"Hi, I am $name")

  //Multiple constructors

  def this(name:String) = this(name, 0)
  def this() = this("John Doe")
}

  //Exercise

  class Writer(firstName: String, surname: String, val year:Int){
    def fullName: String = firstName + " " + surname
  }

  class Novel(name: String, year: Int, author: Writer ){
  def authorAge = year -author.year
    def isWrittenBy(author: Writer) = author ==this.author
    def copy(newYear: Int) : Novel = new Novel(name, newYear,author)
  }

      class Counter(val count: Int) {
      def inc ={
        println("incrementing")
        new Counter(count + 1) //immutability
      }
        def dec = {
          println("decrementing")
          new Counter(count - 1)
        }

        def inc(n: Int) : Counter = {
          if (n<=0) this
          else inc.inc(n-1)
        }

        def dec(n: Int) : Counter =
          if (n <= 0) this
          else dec.dec(n-1)

        def print = println(count)
    }



//class parameters are NOT FIELDS