object question5 extends App
{
  /*  recursive functions (isEven and isOdd are mutually recursive) to determine the even and odd numbers
      (returns true for even and false for odd)
   */

  def isEven(n:Int) : Boolean = n  match
  {
    case 0 => true
    case _ => isOdd(n-1)
  }

  def isOdd(x:Int) : Boolean =
  {
    !(isEven(x))
  }

  //function to add all even numbers less than given n.
  //Assumption - given n is also considered and taken into the addition
  def evenAddition(n:Int) : Int = n match
  {
    case n if n==0 =>  0
    case n if(isEven(n)) => n+evenAddition(n-2)
    case _ => evenAddition(n-1)
  }

//driver
  print(evenAddition(12))
}
