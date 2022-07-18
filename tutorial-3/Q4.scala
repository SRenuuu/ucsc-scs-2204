// Tutorial 3 - Question 4
object Q4 {
  val bookCoverPrice = 24.95
  val fixedShippingCost = 3
  val fixedShippingQty = 50
  val variableShippingCost = 0.75

  def main(args: Array[String]): Unit = {
    println(s"Total wholesale cost for 60 copies: Rs. ${totalCost(60)}")
  }

  def bookCost(numOfCopies: Int): Double = bookCoverPrice * 0.6 * numOfCopies
  def shippingCost(numOfCopies: Int): Double =
    if (numOfCopies <= fixedShippingQty) fixedShippingCost
    else
      fixedShippingCost + variableShippingCost * (numOfCopies - fixedShippingQty)
  def totalCost(numOfCopies: Int): Double =
    bookCost(numOfCopies) + shippingCost(numOfCopies)
}
