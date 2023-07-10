import scala.io.StdIn
object Prime {
  def main(args: Array[String]): Unit = {
    printf("Provide a value below which we want the prime numbers to be:  ")
    var n = StdIn.readInt()
    primeSeq(n)
  }

  def primeSeq(n: Int): Unit = {
    def isPrime(num: Int, divisor: Int): Boolean = {
      if (divisor * divisor > num)
        true
      else if (num % divisor == 0)
        false
      else
        isPrime(num, divisor + 1)
    }

    def print(start: Int): Unit = {
      if (start < n) {
        if (isPrime(start, 2))
          println(start)
        print(start + 1)
      }
    }

    print(2)
  }
}
