object question3 extends App
{
  def TotalCost( copies:Int) : Double =
  {
    var bookCosts:Double = 24.95*0.6*copies //calculates the cost for books

    var shippingCosts:Double = 3
    var extraCopies:Int = 0
    if (copies > 50) //calculates the shipping costs
      {
        extraCopies=copies-50
        shippingCosts = 3 + extraCopies*0.75
      }

    return (bookCosts+shippingCosts)
  }
  println("Rs."+TotalCost(60))
}
