// Tutorial 3 - Question 5
object Q5 {
  def main(args: Array[String]): Unit = {
    println(
      s"Total running time: ${easyPace(2) + tempoPace(3) + easyPace(2)} min"
    )
  }

  def easyPace(numOfKMs: Int): Int = numOfKMs * 8
  def tempoPace(numOfKMs: Int): Int = numOfKMs * 7
}
