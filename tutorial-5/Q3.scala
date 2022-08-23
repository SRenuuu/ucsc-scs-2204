// Tutorial 5 - Question 3

object Q3 {
  def main(args: Array[String]): Unit = {
    println(sum(3))
  }

  def sum(n: Int): Int = n match {
    case 0 => n
    case _ => n + sum(n - 1)
  }
}
