// Tutorial 6 - Question 1

object Q1 {
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  val key = 5

  def main(args: Array[String]): Unit = {
    val cipherText = cipher(encrypt, "ABC", key, alphabet)
    val plainText = cipher(decrypt, cipherText, key, alphabet)

    printf("Cipher Text : %s\n", cipherText)
    printf("Plain Text : %s\n", plainText)
  }

  // Function that encrypts data using Caesar Cipher
  val encrypt = (c: Char, key: Int, str: String) =>
    str((str.indexOf(c.toUpper) + key) % str.size)

  // Function that decrypts data using Caesar Cipher
  val decrypt = (c: Char, key: Int, str: String) => encrypt(c, -key, str)

  // HOF that takes encrypt/decrypt function and process the data
  val cipher =
    (algo: (Char, Int, String) => Char, s: String, key: Int, a: String) =>
      s.map(algo(_, key, a))
}
