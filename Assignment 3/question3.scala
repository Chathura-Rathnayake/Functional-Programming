object question3 extends App
{
  //To output the addition of numbers from 1 to n
  def addition(n:Int) : Int = n match
  {
    case n if n==1 =>  1
    case _ => n+addition(n-1)

  }
  //driver
print(addition(5))

}
