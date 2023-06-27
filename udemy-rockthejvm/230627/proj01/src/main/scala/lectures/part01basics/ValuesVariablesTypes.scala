package lectures.part01basics

object ValuesVariablesTypes extends App {
  val x: Int = 42
  println(x)

  val message = "Hello, World!"
  println(message)

  val z = 2
  val y = z + " items"
  println(y)

  def succ(x: Int) = x + 1

  // this will give an error
  // there is type mismatch
  //def x2: Int = "Hi!"

  // sometimes the compiler will not be able to infer the types
  def factorial(n: Int): Int =
    if (n <= 0) 1
    else n * factorial(n - 1)
}