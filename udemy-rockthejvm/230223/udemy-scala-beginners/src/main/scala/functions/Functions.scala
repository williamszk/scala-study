package functions

object Functions extends App {

  def aFunc(paramA: String, paramB: String): String = {
    paramA + " " + paramB
  }

  def aParamLessFunc(): Int = 99

  println(aFunc("Hello", "World"))
  println(aParamLessFunc())

  def repeatString(str: String, n: Int): String = {
    if (n == 1) str
    else str + repeatString(str, n - 1)
  }

  println(repeatString("RepeatMe! ", 3))

  def aFuncWithSideEffects(str: String): Unit = {
    println(str)
  }

  aFuncWithSideEffects("Calling func with side effects.")

  def outerFunc(n: Int): Int = {
    def innerFunc() = {
      10
    }

    innerFunc() * n
  }

  println("The return of outerFunc: " + outerFunc(2))


  def greet(name: String, age: Int): String = {
    s"Hi, my name is $name and I am $age years old."
  }

  println(greet("John", 10))

  def fac(n: Int): Int = {
    if (n == 0) 1
    else n * fac(n - 1)
  }

  println(s"Factorial of 5: ${fac(5)}")

  def fib(n: Int): Int = {
    if (n == 0) 1
    else if (n == 1) 1
    else fib(n - 1) + fib(n - 2)
  }

  println(s"Fibonacci of 10 is ${fib(10)}")

  def isPrime(n: Int, i:Int=2): Boolean = {
    if (n==2) true
    else if (n==1) false
    else if (n % i == 0) false
    else if (i * i > n) true
    else isPrime(n, i+1)
  }

  println(s"Is 7 prime? ${isPrime(7)}" )
  println(s"Is 9 prime? ${isPrime(9)}" )
  println(s"Is 10 prime? ${isPrime(10)}" )
  println(s"Is 11 prime? ${isPrime(11)}" )

  def isPrime2(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)
    }
    isPrimeUntil(n/2)
  }
  println("============================================" )
  println(s"Is 7 prime? ${isPrime2(7)}" )
  println(s"Is 9 prime? ${isPrime2(9)}" )
  println(s"Is 10 prime? ${isPrime2(10)}" )
  println(s"Is 11 prime? ${isPrime2(11)}" )



}

