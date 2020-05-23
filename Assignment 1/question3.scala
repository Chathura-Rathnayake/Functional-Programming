object question3 extends App
{
  def TotalCost( copies:Int) : Double =
  {
    /*
        Assumptions 
              Meaning of this part in the question -> "Shipping costs Rs. 3 for the first 50 copy" is, 
              the total amount for all the 50 books are Rs. 3.00 and it's not Rs. 3.00 for each book.
    */
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
