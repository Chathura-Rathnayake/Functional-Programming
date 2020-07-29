object Question01AndQuestion02 extends App
{
  val x = new Rational(3,4)
  val y = new Rational(5,8)
  val z = new Rational(2,7)

  println(x.sub(y).sub(z)) //final answer for question 02
}

class Rational(n:Int,d:Int)
{
  private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd (b,a%b)

  val numer = n/gcd(Math.abs(n),d)
  val denom = d/gcd(Math.abs(n),d)

  require(denom>0,"Denominator should be a positive number.!")
  def this(n:Int) = this(n,1) //to handle single value inputs

  def neg = new Rational(-numer,denom) //the answer for question 01

  def +(num:Rational) = new Rational(this.numer*num.denom+num.numer*this.denom,this.denom*num.denom)
  def sub(num:Rational) : Rational = this+(num.neg)

  override def toString = numer+"/"+denom
}