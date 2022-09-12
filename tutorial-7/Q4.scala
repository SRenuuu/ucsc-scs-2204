// Tutorial 7 - Question 4

object Q4 extends App {
  val a1: Account = new Account("1", "001", 4000)
  val a2: Account = new Account("2", "002", 5000)
  val a3: Account = new Account("3", "003", -2000)
  val a4: Account = new Account("4", "004", -500)
  var bank: List[Account] = List(a1, a2, a3, a4) // List of accounts

  def accountsWithNegativeBalances(): List[Account] =
    bank.filter(x => x.accBalance < 0)

  def sumOfAllAccounts(): Double =
    bank.map(x => x.accBalance).reduce((x, y) => x + y)

  def interest(x: Account): Unit = {
    if (x.accBalance > 0) {
      x.accBalance *= 1.05
    } else if (x.accBalance < 0) {
      x.accBalance *= 0.9
    }
  }

  // Print list of accounts with negative balances
  println("\nAccounts with negative balances: ")
  accountsWithNegativeBalances().foreach(x => println(x))

  // Print sum of all account balances
  println("\nSum of all account balances: " + sumOfAllAccounts())

  // Calculate final balances of all accounts after apply the interest function
  println("\nFinal balances of all accounts: ")
  bank.foreach(x => (interest(x), println(x)))
}

class Account(i: String, accNum: String, accBal: Double) {
  var id: String = i
  var accNumber: String = accNum
  var accBalance: Double = accBal

  override def toString: String =
    "[" + id + " : " + accNumber + " : " + accBalance + "]"
}
