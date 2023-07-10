import scala.io.StdIn
object Sum {
  def main(args: Array[String]): Unit = {
    printf("Provide a value:  ")
    val n = StdIn.readInt()
    val result = sum(n)
    println(s"$result") 
  }
  def sum(n: Int): Int ={
    if(n <= 0)
    0
    else if (n%2 == 0)
        n + sum(n-2)
    else
        sum(n-1)
  }

}
