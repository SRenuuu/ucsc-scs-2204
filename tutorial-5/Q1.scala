// Tutorial 5 - Question 1

object Q1 {
  def main(args: Array[String]): Unit = {
    println(prime(5));
    println(prime(8));
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
}
