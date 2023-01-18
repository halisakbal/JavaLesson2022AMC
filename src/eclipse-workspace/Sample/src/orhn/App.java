/*----------------------------------------------------------------------------------------------------------------------	 
	
----------------------------------------------------------------------------------------------------------------------*/

package orhn;

class App {	
	public static void main(String [] args)
	{
		Point p1, p2;
		
		p1 = new Point();
		p2 = new Point();
		
		p1.x = 10;
		p1.y = 20;
		p2.x = 15;
		p2.y = 25;
		
		p1.print();
		p2.print();
		
		int x = 13, y = 16;
		
		double d;
		
		d = p1.distance(x, y);
		
		System.out.printf("Distance : %f%n", d);
		
		d = p1.distance(p2);
		
		System.out.printf("Distance : %f%n", d);
		
		d = p1.distance();
		
		System.out.printf("Distance : %f%n", d);
	}
}


class Point{
	public int x;
	public int y;
	
	public double distance() 
	{
		return distance(0, 0);
	}
	
	public double distance(Point other) 
	{
		return distance(other.x, other.y);
	}
	
	public double distance(int a, int b) 
	{
		return Math.sqrt(Math.pow(x - a, 2) + Math.pow(y - b, 2));
	}
	
	public void offset(int dx, int dy)
	{
		x += dx;
		y += dy;
	}
	
	public void print()
	{
		System.out.printf("(%d, %d)%n", x, y);
	}
}


