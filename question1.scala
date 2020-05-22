object question1 extends App
{
  def CelciusToFahrenheit( x:Double) : Double =
  {
    var answer:Double = 0
    answer = (x * (1.8)) + 32
    return answer
  }
  println(CelciusToFahrenheit(35.0)+ " °F")

}