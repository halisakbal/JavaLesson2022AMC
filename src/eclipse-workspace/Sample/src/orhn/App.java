
/*----------------------------------------------------------------------------------------------------------------------	 
 	1.Aday metotlar : 1, 2, 3, 4
 	2. Uygun metotlar: 1, 2, 3, 4
 	3. En uygun metot: 1
 	
 	
 	T1 ->T2 T1-> T3------  T2 -> T3 ve T2 ye donusmuyor T2
----------------------------------------------------------------------------------------------------------------------*/

package orhn;

class App {	
	public static void main(String [] args)
	{
		short a = 10;
		
		MyMath.abs(a); 

	}
}

class MyMath{
	public static int abs(int a)  //#1
	{
		System.out.println("MyMath.abs int");
		return a < 0 ? -a : a;
	}
	
	public static double abs(double a)  //#2
	{
		System.out.println("MyMath.abs double");
		
		return a < 0 ? -a : a;
	}
		
	public static float abs(float a)  //#3
	{
		System.out.println("MyMath.abs float");
		
		return a < 0 ? -a : a;
	}
	
	public static long abs(long a)  //#4
	{
		System.out.println("MyMath.abs long");
		
		return a < 0 ? -a : a;
	}
}


