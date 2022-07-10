// Tutorial 2 - Q4a

object Question4a {
  def main(args: Array[String]): Unit = {
    println(s"Take-home Salary = Rs. ${takeHomeSalary(40, 30)}")
  }

  def normalHourPay(hours: Float): Float = hours * 250

  def otHourPay(hours: Float): Float = hours * 85

  def tax(pay: Float): Float = pay * 12 / 100

  def takeHomeSalary(normalHours: Float, otHours: Float): Float = {
    val totalPay: Float = normalHourPay(normalHours) + otHourPay(otHours);
    totalPay - tax(totalPay);
  }
}
