/*----------------------------------------------------------------------------------------------------------------------	 
	Sınıf Çalışması: Parametresi ile aldığı bir yazının sadece başındaki boşluk karakterlerini atan trimLeading ve
 	sadece sonundaki boşluk karakterlerini atan trimTrailing isimli metotları StringUtil sınıfı içerisinde yazınız ve 
 	aşağıdaki kod ile test ediniz
----------------------------------------------------------------------------------------------------------------------*/

package orhn;

import java.util.Iterator;

class App {	
	public static void main(String [] args)
	{		
		TrimLeadingTrailingTest.run();
	}
}

class TrimLeadingTrailingTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();		
			
			if ("elma".equals(s))
				break;
			
			System.out.printf("(%s)%n", StringUtil.trimLeading(s));			
			System.out.printf("(%s)%n", StringUtil.trimTrailing(s));			
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class StringUtil{
	public static String trimLeading(String str)
	{
		int i;
		int len = str.length();
		
		for (i = 0; i < len && Character.isWhitespace(str.charAt(i)); i++) 
			;

		return str.substring(i);
	}
	
	public static String trimTrailing(String str)
	{
		int i;
		
		for (i = str.length() - 1; i >= 0 && Character.isWhitespace(str.charAt(i)); --i) 
			;

		return str.substring(0, i + 1);
	}
}


