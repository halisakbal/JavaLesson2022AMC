/*----------------------------------------------------------------------------------------------------------------------	 
	Sınıf Çalışması: Parametresi ile aldığı int türden bir n değeri için n tane rasgele üretilmiş Türkçe alfabedeki
	karakterlerden oluşan bir yazı döndüren getRandomTextTR ile n tane rasgele üretilmiş İngilizce alfabedeki
	karakterlerden oluşan bir yazı döndüren getRandomTextEN metotlarını StringUtil sınıfı içerisinde yazınız ve 
	aşağıdaki kod ile test ediniz  		
----------------------------------------------------------------------------------------------------------------------*/

package orhn;

class App {	
	public static void main(String [] args)
	{
		GetRandomTextTRENTest.run();
	}
}

class GetRandomTextTRENTest {
	public static void run()
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		java.util.Random r = new java.util.Random();
		
		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int n = kb.nextInt();
			
			if (n <= 0)
				break;
			
			System.out.printf("Şifre:%s%n", StringUtil.getRandomTextTR(r, n));
			System.out.printf("Password:%s%n", StringUtil.getRandomTextEN(r, n));
			
			
			System.out.printf("Şifre:%s%n", StringUtil.getRandomTextTR(n));
			System.out.printf("Password:%s%n", StringUtil.getRandomTextEN(n));
		}				
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class StringUtil{
	public static String getRandomTextTR(java.util.Random r, int n)
	{
		return getRandomText(r, n, "abcçdefgğhıijklmnoöprsştuüvyzABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ");	
	}
	
	public static String getRandomTextTR(int n)
	{
		return getRandomTextTR(new java.util.Random(), n);
	}
	
	public static String getRandomTextEN(java.util.Random r, int n)
	{
		return getRandomText(r, n, "abcdefghijklmnopqrstuwxvyzABCDEFGHIJKLMNOPQRSTUWXVYZ");
	}
	
	public static String getRandomTextEN(int n)
	{
		return getRandomTextEN(new java.util.Random(), n);
	}
	
	public static String getRandomText(java.util.Random r, int n, String sourceText)
	{
		String str = "";
		int len = sourceText.length();
		
		for(int i = 0; i < n; ++i)
			str += sourceText.charAt(r.nextInt(len));
		
		return str;
	}
}

