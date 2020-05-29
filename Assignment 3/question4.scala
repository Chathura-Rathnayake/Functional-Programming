object question4 extends App
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

  //driver
  print(isEven(3))
}
