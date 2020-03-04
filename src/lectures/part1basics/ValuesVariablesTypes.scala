package lectures.part1basics

object ValuesVariablesTypes extends App {


  //VALUES
  val x: Int = 42
  print(x);

  //VALS ARE IMMUTABLE
  //COMPILER CAN INFER TYPE

  //TYPES
  val aString: String = "Hello"
  val anotherString = "goodbye"

  val aBoolean: Boolean =  false
  val aChar: Char= 'a';
  val anInt : Int = 4613
  val aLong: Long = 4534534654645L
  val afloat : Float = 2.0f
  val aDouble: Double = 3.14

  //VARIABLES
  var aVariable: Int = 4
  aVariable = 5 //side effects

}
