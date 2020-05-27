
object question1 extends App
{
  //A function to calculate the earnings for normal hours
  def normalHoursEarning(normalHrs:Int ) : (Int) =
  {
    150*normalHrs
  }

  //A function to calculate the earnings for OT hours
  def OThoursEarning(OThrs:Int) : (Int) =
  {
    75*OThrs
  }

  //A function to calculate the total earnings
  def TotalEarnings(hrs1:Int , hrs2:Int) =
  {
    +normalHoursEarning(hrs1)+OThoursEarning(hrs2)
  }

  //A function to calculate the tax
  def CalculateTax(TotIncome:Int) =
  {
    TotIncome*0.1
  }

  //A function to calculate the final take home salary
  def TakeHomeSalary(h1:Int , h2:Int) =
  {
    TotalEarnings(h1,h2)-CalculateTax(TotalEarnings(h1,h2))
  }

  printf("Take Home Salary is Rs.%.2f",TakeHomeSalary(24,10))
}
