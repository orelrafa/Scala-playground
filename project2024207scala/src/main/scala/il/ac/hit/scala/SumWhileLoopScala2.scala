package il.ac.hit.scala

//Assignment 3 - part 1/2
/*
Develop a simple program calculates the total of all numbers in between 
1 and 100 (included) using a simple while loop. Develop two versions. One will be in 
according to Scala 2.x and the other will be in according to Scala 3.x. 
 */

object SumWhileLoopScala2 {
  def main(args: Array[String]): Unit = {
    var sum = 0
    var i = 1

    while (i <= 100) {
      sum += i
      i += 1
    }

    println("Sum of numbers from 1 to 100 is: " + sum)
  }
}
