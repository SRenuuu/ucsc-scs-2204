// Tutorial 3 - Question 2
object Q2 {
  def main(args: Array[String]): Unit = {
    println(s"35°C in Fahrenheit: ${celsiusToFahrenheit(35)} °F")
  }

  def celsiusToFahrenheit(temp: Int): Double = temp * 1.8000 + 32.00
}
