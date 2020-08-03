object caseClasses_Assignment extends App
{
  //Testing the case class

  //Declaring two points
  val point1 = Point(-7,-4)
  val point2 = Point(17,6)

  //Adding two points
  println("Addition: "+(point1+point2))

  //Moving a point
  println("Moving: "+point1.move(10,3))

  //Calculating the distance between two points
  println("Distance: "+point1.distance(point2))

  //Inverting a point
  println("Inverting: "+point1.invert)

}

case class Point(x:Int,y:Int)
{
  //To add two points - Answer to the question 01
  def +(p:Point) = Point(this.x+p.x,this.y+p.y)

  //To move a given point by the distance (dx,dy) - Answer to the question 02
  def move(dx:Int,dy:Int)= Point(this.x+dx,this.y+dy)

  //To calculate the distance between two points - Answer to the question 03
  def distance(p:Point): Double = scala.math.sqrt(scala.math.pow((p.x-this.x),2) + scala.math.pow((p.y-this.y),2))

  //To invert a point - Answer to the question 04
  def invert = Point(y,x)
}