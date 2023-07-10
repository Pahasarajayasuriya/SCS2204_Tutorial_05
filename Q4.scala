import scala.io.StdIn
object check {
  def main(args: Array[String]): Unit = {
    printf("Enter a number:  ")
    val n = StdIn.readInt()
    if(Even(n))
    println("Even number")
    else
    println("Odd number")
  }
  def Even(n:Int):Boolean = {
    if(n == 0)
    true
    else if(n == 1)
    false
    else
        Even(n-2)
  }

}
