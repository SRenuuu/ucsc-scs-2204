// Tutorial 2 - Q1, Q2 and Q3

object Questions1to3 extends App {
  // Questions 1 and 2

  var g = 4.0f

//Scoped to prevent affecting Q3
  {
    var k, i, j = 2
    var m, n = 5
    var f = 12.0f
    var g = 4.0f
    var c = 'X'

    println(k + 12 * m)
    println(m / j)
    println(n % j)
    println(m / j * j)
    println(f + 10 * 5 + g)
    // println(++i * n); -> Prefix and postfix operators are not supported in Scala
  }

  // Question 3

  var a: Int = 2
  var b: Int = 3
  var c: Int = 4
  var d: Int = 5
  var k: Float = 4.3f

  // println(--b * a + c * d--); -> Invalid syntax
  // println(a++); -> Invalid syntax
  println(-2 * (g - k) + c);
  // println(c = c++); -> Invalid syntax
  // println(c = ++c * a++); -> Invalid syntax
}
