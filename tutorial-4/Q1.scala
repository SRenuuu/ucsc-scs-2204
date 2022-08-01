// Tutorial 4 - Question 1
object Q1 {
  def main(args: Array[String]): Unit = {
    println(calculateInterest(25000))
  }

  def calculateInterest(depositAmount: Double): Double = depositAmount match {
    case x if x < 0        => 0
    case x if x < 20000    => 0.02 * x
    case x if x < 200000   => 0.04 * x
    case x if x < 2000000  => 0.035 * x
    case x if x >= 2000000 => 0.065 * x
  }
}
