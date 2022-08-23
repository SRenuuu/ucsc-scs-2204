// Tutorial 5 - Question 4

object Q4 {
  def main(args: Array[String]): Unit = {
    oddOrEven(5)
  }

  def oddOrEven(n: Int): Unit = {
    if (isEven(n)) println(s"$n is even")
    else println(s"$n is odd")
  }

  def isEven(n: Int): Boolean = n match {
    case 0 => true
    case _ => isOdd(n - 1)
  }

  def isOdd(n: Int): Boolean = !(isEven(n))
}
