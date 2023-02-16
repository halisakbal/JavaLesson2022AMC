/*-----------------------------------------------------
  	FILE		: PointF.java
  	AUTHOR		: Orhan OZTURK
  	LAST UPDATE : 16.02.2023
  	
  	PointF class that represents a 2 dimensional pointF int Cartesian plane
  	
  	
  	Copyleft(c) 1992 by Orhan ÖZTÜRK All Rights Free
   
 -----------------------------------------------------*/

package com.orhn.math.geometry;

public class PointF{
	public float x;
	public float y;
	
	public PointF()
	{
	}
	
	public PointF(float a)
	{
		x = a;
	}
	
	public PointF(float a, float b)
	{
		x = a;
		y = b;
	}
	
	public double distance() 
	{
		return distance(0, 0);
	}
	
	public double distance(PointF other) 
	{
		return distance(other.x, other.y);
	}
	
	public double distance(float a, float b) 
	{
		return Math.sqrt(Math.pow(x - a, 2) + Math.pow(y - b, 2));
	}
	
	public void offset(float dx, float dy)
	{
		x += dx;
		y += dy;
	}
	
	public void print()
	{
		System.out.printf("(%f, %f)%n", x, y);
	}
	
	public String toString()
	{
		return String.format("(%f, %f)", x, y);
	}
}