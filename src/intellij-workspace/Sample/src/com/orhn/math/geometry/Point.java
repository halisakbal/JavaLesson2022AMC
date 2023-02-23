/*-----------------------------------------------------
  	FILE		: Point.java
  	AUTHOR		: Orhan OZTURK
  	LAST UPDATE : 16.02.2023
  	
  	Point class that represents a 2 dimensional point int Cartesian plane
  	
  	
  	Copyleft(c) 1992 by Orhan ÖZTÜRK All Rights Free
   
 -----------------------------------------------------*/

package com.orhn.math.geometry;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point{
	public int x;
	public int y;
	
	public Point()
	{
	}
	
	public Point(int a)
	{
		x = a;
	}
	
	public Point(int a, int b)
	{
		x = a;
		y = b;
	}
	
	public double distance() 
	{
		return distance(0, 0);
	}
	
	/**
	 * 
	 * @param other
	 * @return
	 */
	
	public double distance(Point other) 
	{
		return distance(other.x, other.y);
	}
	
	public double distance(int a, int b) 
	{
		return sqrt(pow(x - a, 2) + pow(y - b, 2));
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
	
	public String toString()
	{
		return String.format("(%d, %d)", x, y);
	}
}