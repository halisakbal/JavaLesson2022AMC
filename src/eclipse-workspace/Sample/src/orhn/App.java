/*
 * printf metodunda tamsayılar için hizalam yapılabilir
 * 
 */

package orhn;

public class App {
	public static void main(String [] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Gün : ");
		int day = Integer.parseInt(kb.nextLine());
		System.out.print("Ay : ");
		int mon = Integer.parseInt(kb.nextLine());
		System.out.print("Yıl : ");
		int year = Integer.parseInt(kb.nextLine());
		
		
		System.out.printf("%2d/%02d/%4d%n", day, mon, year);

	}
}

