public class Triangle {
private Point v0,v1,v2;
public Triangle(Point tv1, Point tv2, Point tv3){
  v0 = tv1.copy();
  v1 = tv2.copy();
  v2 = tv3.copy();
}
public Triangle(double vx1, double vy1, double vx2, double vy2, double vx3, double vy3){
  v0 = new Point(vx1,vy1);
  v1 = new Point(vx2,vy2);
  v2 = new Point(vx3,vx3);
}
public double getPerimeter(){
  return Point.distance(v0,v1) + Point.distance(v1,v2) + Point.distance(v2,v0);
}
public Point getVertex(int index){
  if (index == 0) {
    return v0;
  }
  if (index == 1) {
    return v1;
  }
  else {
    return v2;
  }
}
public void setVertex (int index, Point newP){
if (index == 0) {
  v0 = newP.copy();
}
if (index == 1) {
  v1 = newP.copy();
}
if (index == 2) {
  v2 = newP.copy();
}
}
public String toString() {
  return "Triangle: A(" + v0 + " B" + v1 + " C" + v2;
}
}
