import scala.io.StdIn
object prime{
    def main(args: Array[String]): Unit = {
        printf("Enter a number: ")
        var number = StdIn.readInt()
        val primenumber = prime(number)
        println(s"$primenumber");
    }

    def prime(n: Int): Boolean ={
        if(n <= 1) false
        else if(n == 2) true
        else prime(n,2)

    }
    def prime(n: Int, divisor:Int): Boolean = {
        if (divisor * divisor > n) true
        else if (n % divisor == 0) false
        else prime(n, divisor + 1)
    }
}