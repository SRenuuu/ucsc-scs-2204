// Tutorial 2 - Q4a

object Question4b {
  def main(args: Array[String]): Unit = {
    var maxProfit = 0
    var ticketPriceYieldingMaxProfit = 0

    // Find maximum profit by iterating through ticket prices from 1 to 100
    for (ticketPrice <- 1 to 100) {
      val currentProfit = profit(ticketPrice);
      if (currentProfit >= maxProfit) {
        maxProfit = currentProfit
        ticketPriceYieldingMaxProfit = ticketPrice
      }
    }

    println(s"Highest profit = Rs. ${maxProfit}");
    println(
      s"Ticket price which yields highest profit = Rs. ${ticketPriceYieldingMaxProfit}"
    );
  }

  def profit(ticketPrice: Int): Int = revenue(ticketPrice) - cost(ticketPrice)

  def revenue(ticketPrice: Int): Int = ticketPrice * peopleCount(ticketPrice);

  def cost(ticketPrice: Int): Int = 500 + 3 * peopleCount(ticketPrice)

  def peopleCount(ticketPrice: Int): Int = 120 - (ticketPrice - 15) / 5 * 20
}
