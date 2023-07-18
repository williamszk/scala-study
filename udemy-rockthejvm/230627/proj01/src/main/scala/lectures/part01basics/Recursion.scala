package lectures.part01basics

object Recursion extends App {

  def factorial(n: Int): Int =
    if (n <= 0) 1
    else n * factorial(n - 1)

//  def factorial(n: Int): Int =
//    if (n <= 0) 1
//    else {
//      println("Computing factorial of " + n + " - I first need factorial of " + (n - 1))
//      val result = n * factorial(n - 1)
//      println("Computed factorial of " + n)
//      result
//    }

  // println(factorial(10))
  //  Computing factorial of 10 - I first need factorial of 9
  //  Computing factorial of 9 - I first need factorial of 8
  //  Computing factorial of 8 - I first need factorial of 7
  //  Computing factorial of 7 - I first need factorial of 6
  //  Computing factorial of 6 - I first need factorial of 5
  //  Computing factorial of 5 - I first need factorial of 4
  //  Computing factorial of 4 - I first need factorial of 3
  //  Computing factorial of 3 - I first need factorial of 2
  //  Computing factorial of 2 - I first need factorial of 1
  //  Computing factorial of 1 - I first need factorial of 0
  //  Computed factorial of 1
  //  Computed factorial of 2
  //  Computed factorial of 3
  //  Computed factorial of 4
  //  Computed factorial of 5
  //  Computed factorial of 6
  //  Computed factorial of 7
  //  Computed factorial of 8
  //  Computed factorial of 9
  //  Computed factorial of 10
  //  3628800

  // We can't run this because it will give a stack overflow error.
  // Each iteration of the recursion will use more space in the stack memory.
  // And the stack memory has a limit.
  // println(factorial(5000))

  // What if we wanted to run factorial more than 5000?

  // a smarter way to write recursive functions
  def factorial2(n: Int): BigInt = {
    def helper(x: Int, acc: BigInt): BigInt = {
      if (x <= 1) acc
      else helper(x - 1, x * acc)
    }

    helper(n, 1)
  }
  //   factorial2(5, 1) =
  //   helper(5, 1) =
  //   helper(4, 5 * 1) =
  //   helper(3, 3 * 4 * 1) =
  //   helper(2, 2 * 3 * 4 * 1) =
  //   helper(1, 1 * 2 * 3 * 4 * 1)
  //   1 * 2 * 3 * 4 * 1

  // check that using a big number will work
  println(factorial2(1000))

}
