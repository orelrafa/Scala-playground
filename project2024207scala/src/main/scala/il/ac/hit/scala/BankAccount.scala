package il.ac.hit.scala

//Assignment 7
/*
You should define the BankAccount class.
Every object instantiated from this class should have the balance and
the id properties. The balance cannot be smaller than 0. The id must be bigger
than 1000000 and smaller than 10000000. Write small demo for showing the use in
the class you defined.
 */
class BankAccount(private var _balance: Double, private val _id: Int) {
  // ID must be between 1000000 and 10000000
  require(_id > 1000000 && _id < 10000000, "ID must be between 1000000 and 10000000")

  // Balance cannot be smaller than 0
  require(_balance >= 0, "Balance cannot be negative")

  // Getter for balance
  def balance: Double = _balance

  // Getter for id
  def id: Int = _id

  // Method to deposit money
  def deposit(amount: Double): Unit = {
    require(amount > 0, "Deposit amount must be positive")
    _balance += amount
    println(s"Deposited $amount. New balance: $balance")
  }

  // Method to withdraw money
  def withdraw(amount: Double): Unit = {
    require(amount > 0, "Withdraw amount must be positive")
    if (amount > _balance) {
      println("Insufficient balance!")
    } else {
      _balance -= amount
      println(s"Withdrew $amount. New balance: $balance")
    }
  }
}

// Demo for showing the use of the class
object BankAccountDemo {
  def main(args: Array[String]): Unit = {
    // Create a valid bank account with an initial balance of 1000 and an id
    val account = new BankAccount(1000, 1234567)
    println(s"Account created with ID: ${account.id} and balance: ${account.balance}")

    // Deposit money
    account.deposit(500)

    // Withdraw money
    account.withdraw(300)

    // Attempt to withdraw more than the balance
    account.withdraw(2000)
  }
}
