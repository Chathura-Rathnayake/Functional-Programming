object question1 extends App
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
  //driver
  print(isPrime(5))

}
