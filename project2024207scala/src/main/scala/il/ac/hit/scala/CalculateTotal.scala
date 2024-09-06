package il.ac.hit.scala

object CalculateTotal {
  private var total: Double = 0

  def main(args:Array[String]): Unit = {
    args.foreach(f)
    print(total)
  }

  private def f(text: String): Unit = {
    total += java.lang.Double.parseDouble(text)
  }
}
