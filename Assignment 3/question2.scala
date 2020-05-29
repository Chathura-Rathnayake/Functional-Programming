object question2 extends App
{
  //to calculate the GCD of a number
  def gcd(a:Int, b:Int) : Int = b match
  {
    case 0 => a
    case b if (b>a) => gcd(b,a)
    case _ => gcd(b,a%b)
  }
  //To check whether a number is prime or not
  def isPrime(num : Int, n:Int=2) : Boolean = n match
  {
    case n if(num==n) => true
    case n if (gcd(num,n)>1) => false
    case n => isPrime(num,n+1)
  }
//To print all prime numbers from 2 to a given numeber
  def primeSequence(x : Int) : Unit = x match
  {
    case x if x==2 => println(2)
    case x if isPrime(x) => primeSequence(x-1);println(x)
    case _ => primeSequence(x-1)
  }
//driver
  primeSequence(100)
}
