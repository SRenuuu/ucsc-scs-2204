// Tutorial 3 - Question 1
import scala.math._

object Q1 {
  def main(args: Array[String]): Unit = {
    println(s"Area of a disk with radius 5: ${areaOfDisk(5)}")
  }

  def areaOfDisk(radius: Int): Double = Pi * radius * radius
}
