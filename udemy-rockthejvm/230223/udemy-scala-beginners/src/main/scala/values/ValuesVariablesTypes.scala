package values

object ValuesVariablesTypes extends App{

//  val x: Int = 42
  // the compiler can infer types
  val x = 42
  println(x)

  // vals are immutable
  //  x = 2

  val aString: String = "hello"
  println(aString)

  val aBool: Boolean = true
//  val aBool: Boolean = false
  val anotherBool: Boolean = false

  val aChar: Char = 'a'

  val aInt:Int  = x

  val aShort: Short = 200
  val aLong: Long = 2313091823L

  val aFloat: Float = 2.0f
  val aDouble: Double = 3.0d

  // variables
  var aVariable: Int = 4

  aVariable = 20 // this is a side effect
  // change the values of a variable







}