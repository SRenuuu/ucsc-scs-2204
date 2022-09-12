// Tutorial 7 - Question 1

object Q1 extends App {
  val r: Rational = new Rational(5, 6);
  println(r.neg);
}

class Rational(x: Int, y: Int) {
  def numer = x
  def denom = y

  def neg = new Rational(-this.numer, this.denom)
  override def toString = s"$numer/$denom"
}
