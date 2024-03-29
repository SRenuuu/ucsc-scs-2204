// Tutorial 4 - Question 2
object Q2 {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ");
    println(myFunc(scala.io.StdIn.readInt()));
  }

  def myFunc(input: Int): String = input match {
    case x if x <= 0     => "Negative/Zero is input"
    case x if x % 2 == 0 => "Even number is given"
    case _               => "Odd number is given"
  }
}
