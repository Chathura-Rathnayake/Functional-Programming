object Question03AndQuestion04 extends App
{

  val personA = new Account("97111111v",900,2000)
  val personB = new Account("97000000v",9012,1000)


  personA.transfersTo(personB,1000)  //transferring money - The Question 03

  //balances after transferring
  println(personA)
  println(personB)

  var bank  = List(
    new Account("971232323v",1001,-100),
    new Account("976589455v",1002,100),
    new Account("97643255v",1003,250),
    new Account("976586555v",1004,-50)
  )

  val negativeBalancedAcccounts = (b:List[Account]) => b.filter((x:Account)=>(x.accountBalance<0)) // The Question 4.1

  val total = (b:List[Account]) => b.map((x)=>x.accountBalance).reduce((x,y)=>x+y) // The Question 4.2

  /*
  *   Assumptions
  *     1.Accounts with positive balances get increased
  *     2.Accounts with positive balances get decreased
  *     3.Accounts with balance zero stays the same
  *
  * */

  val interest = (b:List[Account]) => b.map((x)=>if(x.accountBalance>0) x.accountBalance*1.05 else if(x.accountBalance<0) x.accountBalance*1.1) // The Question 4.3

  //view negative balanced accounts
  println("Negative balanced accounts: "+negativeBalancedAcccounts(bank))

  //view the total balance
  println("Total balance of all accounts: "+total(bank))

  //view the account balances after adding the interest
  println("Account balances after adding the interests: "+interest(bank))
}

class Account(id:String,acNum:Int,balance:Double)
{
  val NIC = id
  val accountNumber = acNum
  var accountBalance = balance

  def withdraw(amount:Double)  =
    this.accountBalance=this.accountBalance-amount

  def deposit(amount:Double)  =
    this.accountBalance=this.accountBalance+amount

  def transfersTo(toAccount:Account,amount:Double) =
  {
    this.withdraw(amount)
    toAccount.deposit(amount)
  }

  override def toString = "NIC: "+NIC+"\n"+"Account Number: "+accountNumber+"\n"+"Account Balance: LKR "+accountBalance+"\n"

}