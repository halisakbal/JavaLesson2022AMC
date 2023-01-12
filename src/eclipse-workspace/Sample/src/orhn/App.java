/*----------------------------------------------------------------------------------------------------------------------	 
	Sınıfın non-static bir veri elamanına sınıf dışından sınıf ismi ile erişilemez. Çünkü non-static veri elemanı
	nesneye özeldir
----------------------------------------------------------------------------------------------------------------------*/

package orhn;

class App {	
	public static void main(String [] args)
	{
		Sample.a = 10; // non static oldugu için gecersiz
		
	}
}


class Sample{
	public int a;
	public boolean b;
}


