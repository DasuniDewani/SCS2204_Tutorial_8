package Demo
object Demo {
  def main(args: Array[String]): Unit = {

    case class Point(x:Double,y:Double){

      def +(p1:Point):Point={
        Point(x+p1.x,y+p1.y);
      }
      def move(dir:Double, dis:Char):Point={
         dis match{
           case 'x' => Point(x+dir,y);
           case 'y' => Point(x,y+dir);
         }
      }
      def distance(p1:Point):Double={
        Math.sqrt((y-p1.y)*(y-p1.y)+(x-p1.x)*(x-p1.x));
      }
      def invert():Point={
        Point(y,x);
      }
      def print()={
        "("+x+","+y+")";
      }

    }

    val p1=Point(3,4);
    val p2=Point(5,2);

    println("p1 + p2 = "+(p1.+(p2).print()));
    println("p1 moves to dx by 2 = "+(p1.move(2,'x').print()));
    println("p1 moves to dy by 2 = "+(p1.move(2,'y').print()));
    println("distance between p1 and  p2 = "+p1.distance(p2));
    println("Invert of p1 = "+(p1.invert().print()))


  }
}