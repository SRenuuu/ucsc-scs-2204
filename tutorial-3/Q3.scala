// Tutorial 3 - Question 3
import scala.math._

object Q3 {
  def main(args: Array[String]): Unit = {
    println(s"Volume of a sphere with radius 5: ${volumeOfSphere(5)}")
  }

  def volumeOfSphere(radius: Int): Double =
    4 / 3 * Pi * radius * radius * radius
}
