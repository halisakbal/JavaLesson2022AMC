/*
 * Not: Klavyeden temel türden degerler okuma yöntemlerinin tam anlamı ileride detaylı olarak ele
 * alınacak. Bu sebeple bunları bir kalıp olarak görüp yalnıca kalyeden okuma kısmı ile ilgilenecez.
 * 
 * 
 * Klavyeden int türden değer okunması kalıbı
 * 
 */

package orhn;

public class App {
	public static void main(String [] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayi giriniz:");
		int val = Integer.parseInt(kb.nextLine());
		
		int result = val * val;
		
		System.out.println(result);
		
	}
}

