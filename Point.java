public class Point{
  private double x,y;

//constructor takes one value per instance variable
public Point(double nx, double ny){
  x = nx;
  y = ny;
}

//constructor takes an other point to copy
public Point(Point p){
  x = p.x;
  y = p.y;
}

//method that returns a new copy of 'this'
public Point copy(){
    return new Point(x,y); //this.x and this.y
    //OR
    //return new Point(this);
}
public double getx(){
  return x;
}
public double gety(){
  return y;
}
public double distanceTo(Point fpoint){
  return java.lang.Math.sqrt( ((fpoint.x - this.x) * (fpoint.x - this.x)) + ((fpoint.y - this.y) * (fpoint.y - this.y)) );
}
public double distance(Point thispoint, Point thatpoint){
  return java.lang.Math.sqrt( ((thispoint.x - thatpoint.x) * (thispoint.x - thatpoint.x)) + ((thispoint.y - thatpoint.y) * (thispoint.y - thatpoint.y)) );
}
public String toString() {
  return "(" + x + "," + y + ")";
}
}
