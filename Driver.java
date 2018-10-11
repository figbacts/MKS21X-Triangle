public class Driver{
 public static void main(String[]args){
	Point p1 = new Point(0,0);
	Point p2 = new Point(1,0);
	Point p3 = new Point(0,1);
	Point p4 = new Point(0,4);

	Triangle tri1 = new Triangle(p1,p2,p3);


	//test distanceTo nonstatic
	System.out.println(p1.distanceTo(p2));

	//test distance static
	System.out.println(Point.distance(p1,p2));

	//test Point toString
	System.out.println(p2.toString());



	//test getPerimeter
	System.out.println(tri1.getPerimeter());

	//test getVertex
	System.out.println(tri1.getVertex(0));

	//test setVertex
	tri1.setVertex(0,p4);
	System.out.println("New" + tri1.getVertex(0));

	//test toString
	System.out.println(tri1.toString());
}}
