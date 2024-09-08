package il.ac.hit.scala

//Assignment 3 - part 2/2

@main
def SumWhileLoopScala3(): Unit =
  var sum = 0
  var i = 1

  while i <= 100 do
    sum += i
    i += 1

  println("Sum of numbers from 1 to 100 is: "+sum)
