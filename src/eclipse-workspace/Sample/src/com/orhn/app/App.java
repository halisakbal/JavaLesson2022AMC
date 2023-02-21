/*----------------------------------------------------------------------------------------------------------------------	
	Aşağıdaki örnekte doğrudan sqrt çağrısı için sınıfın int parametreli sqrt metodunun ismi bulunur. Bu durumda uygun
	metot bulunamayacağı için error oluşur. Anımsanacağı gibi isim bulunduktan sonra erişim kontrolü yapılır 
----------------------------------------------------------------------------------------------------------------------*/

package com.orhn.app;

import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.log10;

class App {	
	public static void main(String [] args)
	{		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Bir sayi giriniz : ");
		double a = kb.nextDouble();
		
		System.out.printf("sqrt(%f) = %f%n", a, sqrt(a));
		System.out.printf("log10(%f) = %f%n", a, log10(a));
	}
	
	public static double sqrt(double a)
	{
		return Math.sqrt(a);
	}
	
}


