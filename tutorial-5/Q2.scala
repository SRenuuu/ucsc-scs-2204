// Tutorial 5 - Question 2

object Q2 {
  def main(args: Array[String]): Unit = {
    primeSeq(10);
  }

  def GCD(a: Int, b: Int): Int = b match {
    case 0          => a
    case x if x > a => GCD(x, a)
    case _          => GCD(b, a % b)
  }

  def prime(p: Int, n: Int = 2): Boolean = n match {
    case x if (x == p)      => true
    case x if GCD(p, x) > 1 => false
    case x                  => prime(p, x + 1)
  }

  def primeSeq(n: Int): Unit = n match {
    case x if (x > 1 && prime(x)) => { primeSeq(x - 1); println(x) }
    case x if (x > 1)             => primeSeq(x - 1)
    case x if (x == 1)            => return
  }

}
