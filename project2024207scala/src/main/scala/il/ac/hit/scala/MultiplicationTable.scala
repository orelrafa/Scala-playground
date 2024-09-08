package il.ac.hit.scala

//Assignment 9
/*
Develop a small program that prints out the multiplication table to the screen. 
Your program should use two Range objects, that each one of them represents the 
range of numbers between 1 (included) and 10 (included). 
 */
object MultiplicationTable {
  def main(args: Array[String]): Unit = {
    // Define two ranges from 1 to 10
    val range = 1 to 10

    // Nested loop to print the multiplication table
    for (i <- range) {
      for (j <- range) {
        val result = i * j
        print(f"$result%4d") // Format the output to align columns
      }
      println() // Move to the next line after each row
    }
  }
}
