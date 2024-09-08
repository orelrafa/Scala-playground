package il.ac.hit.scala

//Assignment 8
/*
You should create a list of tuples that represent bank accounts.
Each tuple represent a specific bank account. Each tuple holds the bank account
id number and the bank account balance. You should use the foldLeft method in order
to calculate the total number of accounts and the total balance of these account.
 */
object BankAccountsProgram {
  def main(args: Array[String]): Unit = {
    val bankAccountsLst: List[(Long, Double)] = List[(Long, Double)]((12345, 50.0), (23232, 200.0), (56453, 50.0))
    val totalAccounts: (Int, Double) = calculateTotalBankAccounts(bankAccountsLst)

    println(s"Total number of accounts: ${totalAccounts._1}")
    println(s"Total balance: ${totalAccounts._2}")
  }

  def calculateTotalBankAccounts(bankAccounts: List[(Long, Double)]): (Int, Double) =
    bankAccounts.foldLeft(0, 0d)((t, v) => (t._1 + 1, t._2 + v._2))

}
