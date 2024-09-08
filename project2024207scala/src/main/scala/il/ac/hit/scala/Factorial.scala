package il.ac.hit.scala

//Assignment 4
/*
Define the factorial function. You should implement it in two versions:
1. recursive function
2. not recursive function (implemented using a simple while)
 */
@main
def main(): Unit =

  def factorialRecursive(n: Int): Int =
    if n == 0 then 1
    else n * factorialRecursive(n - 1)

  def factorialNonRecursive(n: Int): Int =
    var result = 1
    var i = n

    while i > 1 do
      result *= i
      i -= 1

    result
  println("factorialRecursive of 5 is: "+factorialRecursive(5))
  println("factorialNonRecursive of 5 is: " + factorialNonRecursive(5))

