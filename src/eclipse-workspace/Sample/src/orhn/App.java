/*
	yukarıdaki kod böyle yazılmalıydı if lerin birbiri ile ilişkili oldugundan 
 */

package orhn;

public class App {
	public static void main(String [] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayi giriniz : ");
		int val = Integer.parseInt(kb.nextLine());
		
		if(val > 0)//***
			System.out.printf("%d sayısı pozitiftir%n", val);
		else if(val == 0)
			System.out.println("Sıfır sayısını girdiniz");
		else if(val < 0)
			System.out.printf("%d sayısı negatiftir%n", val);
		
		
		System.out.println("Tekrar yapiyormusun ALiiii");

	}
}
