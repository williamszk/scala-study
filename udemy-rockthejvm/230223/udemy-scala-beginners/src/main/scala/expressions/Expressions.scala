package expressions

object Expressions extends  App{
  println("Hello there")

  val x = 1 + 2 // expression
  println(x)

  // this is the if expression, it works like a ternary operator
  val aCondition = if (1 < 2){
    5
  } else {
    3
  }

  println(aCondition)

  println("------------------------------")
  var i=0
  while (i<10){
    println(i)
    i += 1
  }
  println("------------------------------")
  var aVariable = 10
  val aWeirdValue = (aVariable = 3)
  println(aWeirdValue)

  println("------------------------------")
  // code blocks

  val aCode01 = {
    val y = 2
    val z = y + 1
    if (z > 2) "hello" else "good bye"
  }

  println(aCode01)
  println("------------------------------")




}
