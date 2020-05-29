object question6 extends App
{

//To find a Fibbonacci value for a given number n
  def fibonacci(n: Int) : Int = n match
  {
    case 0 => 0
    case 1 => 1
    case _ => fibonacci (n - 1) + fibonacci (n - 2)
  }

//to find first n Fibonacci numbers for a given n.
  def fibN(n: Int) : Unit =
  {
    if(n==0)
    {
      println(0)
    }
    else
    {
      fibN(n-1)
      println(fibonacci(n))
    }
  }
//driver
  fibN(10)

}
