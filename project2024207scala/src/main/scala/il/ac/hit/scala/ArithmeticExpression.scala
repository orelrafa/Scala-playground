package il.ac.hit.scala
import scala.collection.mutable

object ArithmeticExpression {

  // Define the operators
  private val operators = List("+", "-", "*", "/")

  private def findWays(start: Int, target: Int, maxOps: Int): (Int, List[String]) = {
    val results = mutable.ListBuffer[String]()

    def generateExpressions(current: Int, expr: String, opsRemaining: Int): Unit = {
      if (opsRemaining < 0) return
      if (opsRemaining == 0) {
        if (current == target) {
          results += expr
        }
        return
      }

      for op <- operators do
        op match {
          case "+" => generateExpressions(current + start, s"$expr+$start", opsRemaining - 1)
          case "-" => generateExpressions(current - start, s"$expr-$start", opsRemaining - 1)
          case "*" => generateExpressions(current * start, s"$expr*$start", opsRemaining - 1)
          case "/" if start != 0 && current % start == 0 => generateExpressions(current / start, s"$expr/$start", opsRemaining - 1)
          case _ =>
        }
    }

    generateExpressions(start, s"$start", maxOps)

    (results.size, results.toList)
  }

  def main(args: Array[String]): Unit = {
    if (args.length != 3) {
      println("Usage: <start> <target> <maxOps>")
      return
    }

    val start = args(0).toInt
    val target = args(1).toInt
    val maxOps = args(2).toInt

    val (count, ways) = findWays(start, target, maxOps)

    println(s"Number of ways: $count")
    println("Possible ways:")
    ways.foreach(println)
  }
}
