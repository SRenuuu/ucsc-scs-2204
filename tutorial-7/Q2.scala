// Tutorial 7 - Question 2

object Q2 extends App {
  val x: Rational = new Rational(3, 4);
  val y: Rational = new Rational(5, 8);
  val z: Rational = new Rational(2, 7);

  println(x.sub(y).sub(z));
}

class Rational(x: Int, y: Int) {
  def numer = x
  def denom = y

  def sub(r: Rational) =
    new Rational(numer * r.denom - r.numer * denom, denom * r.denom)
  override def toString = s"$numer/$denom"
}
