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
    println("Please provide a number larger than 1")
    else n + sum(n-1)
  }

}
