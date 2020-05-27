object question2 extends App
{
  //function to calculate the number of attendees
  def attendees(ticketPrice:Int) =
  {
    ((15-ticketPrice)*20)/5+120
  }

  //function to calculate the cost for attendees
  def costForAttendees(tPrice:Int) =
  {
    3*attendees(tPrice)
  }

  //function to calculate the total cost
  def TotalCost(tktPrice:Int) =
  {
    500+costForAttendees(tktPrice)
  }
  //function to calculate the total income
  def TotalGain(tPrc:Int) =
  {
    tPrc*attendees(tPrc)
  }

  //function to calculate the profit
  def profit(tkt_price:Int) =
  {
    TotalGain(tkt_price)-TotalCost(tkt_price)
  }

  //to identify the best ticket price
  print(profit(10),profit(15),profit(20),profit(25),profit(30),profit(35))

}
