package il.ac.hit.scala

//Assignment 2
/*
You should develop a recursive function that takes a two dimension array and
calculates the number of paths that can take us from the top left corner to
the right bottom corner.
Each move can be either one step to the right or one step to the bottom.
 */

object HowManyPaths {
  private def countPaths(grid: Array[Array[Int]], row: Int, col: Int): Int = {
    // If we're out of bounds, return 0
    if (row >= grid.length || col >= grid(0).length) return 0

    // If we're in the bottom-right corner, we've found a valid path
    if (row == grid.length - 1 && col == grid(0).length - 1) return 1

    // Otherwise, recursively calculate the number of paths by moving right and down
    val rightPaths = countPaths(grid, row, col + 1)
    val downPaths = countPaths(grid, row + 1, col)

    rightPaths + downPaths
  }

  def main(args: Array[String]): Unit = {
    val grid = Array.ofDim[Int](3, 3) // Example: 3x3 grid
    println(s"Number of paths: ${countPaths(grid, 0, 0)}")
  }
}

