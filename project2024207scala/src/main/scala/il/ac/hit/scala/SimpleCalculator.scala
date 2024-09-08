package il.ac.hit.scala

//Assignment 5
/*
You should develop a simple application that works as a simple calculator.
When running this calculator we should pass over three arguments. The first and the
third arguments should be plain simple numbers. The second argument should be one of
the following strings: +, -, * or /. Your implementation should use the match statement.
 */
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
