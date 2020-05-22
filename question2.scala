object question2 extends App
{
  def SphereVolume( r:Double) : Double =
  {
    var volume:Double = (4.toDouble/3)*(Math.PI)*(Math.pow(r,3))
    return volume
  }
  println(SphereVolume(5))


}
