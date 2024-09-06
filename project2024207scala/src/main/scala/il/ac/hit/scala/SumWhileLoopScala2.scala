package il.ac.hit.scala

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
