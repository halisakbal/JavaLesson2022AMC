/*----------------------------------------------------------------------------------------------------------------------	 
	Complex sınıfı
----------------------------------------------------------------------------------------------------------------------*/

package orhn;

class App {	
	public static void main(String [] args)
	{		
		Complex z1 = new Complex(2, 5);
		Complex z2 = new Complex(-3, 4.56);
		Complex z;
		

		z = z1.add(z2);
		z.print();
		
		z = z1.add(3.4);
		z.print();
		
		z = Complex.add(3.5, z1);
		z.print();
		
	}
}


class Complex{
	public double real;
	public double imag;
	
	public static Complex add(double a1, double b1, double a2, double b2)
	{
		return new Complex(a1 + a2, b1 + b2);
	}

	
	public Complex()
	{
	}
	
	public Complex(double re)
	{
		real = re;
	}
	
	public Complex(double re, double im)
	{
		real = re;
		imag = im;
	}
	
	public double getNorm()
	{
		return Math.sqrt(real * real + imag * imag);
	}
	
	
	public static Complex add(double value, Complex z) 
	{
		return add(value, 0, z.real, z.imag);
	}
	
	public Complex add(Complex other)
	{
		return add(real, imag, other.real, other.imag);
	}
	
	public Complex add(double value)
	{
		return add(real, imag, value, 0);
	}
	
	public void print()
	{
		System.out.printf("|%.2f, %.2f| = %f%n", real, imag, getNorm());
	}
	
}