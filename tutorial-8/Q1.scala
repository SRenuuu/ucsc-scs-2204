// Tutorial 8 - Question 1
import scala.math._

object Q1 extends App {
  var p1: Point = Point(2, 3)
  var p2: Point = Point(4, 5)

  println(p1 + p2)
  println(p1.move(-1, -1))
  println(p1.distance(p2))
  println(p2.invert())
}

case class Point(x: Int, y: Int) {
  def +(that: Point): Point = new Point(this.x + that.x, this.y + that.y)

  def move(dx: Int, dy: Int): Point = Point(x + dx, y + dy)

  def distance(p: Point): Double = sqrt(
    pow(this.x - p.x, 2) + pow(this.y - p.y, 2)
  )

  def invert(): Point = Point(y, x)
}
