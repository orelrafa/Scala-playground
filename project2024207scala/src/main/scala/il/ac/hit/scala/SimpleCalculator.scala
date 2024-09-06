package il.ac.hit.scala

@main 
def SimpleCalculator(args: String*): Unit =
  if (args.length != 3) {
    println("Usage: calculator <number1> <operator> <number2>")
    println("Operator must be one of: +, -, *, /")
    return
  }

  val num1 = args(0).toDoubleOption
  val operator = args(1)
  val num2 = args(2).toDoubleOption

  (num1, num2) match {
    case (Some(a), Some(b)) =>
      val result = operator match {
        case "+" => a + b
        case "-" => a - b
        case "*" => a * b
        case "/" =>
          if (b != 0) a / b
          else "Error: Division by zero"
        case _ => "Error: Invalid operator"
      }
      println(result)

    case _ =>
      println("Error: Invalid number format")
  }
