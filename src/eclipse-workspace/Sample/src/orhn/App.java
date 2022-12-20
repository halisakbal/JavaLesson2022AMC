/*
 *   Kontrolün sonra yapıldığı while döngü deyiminin (do-while döngüsü) genel biçimi:
	 
	 do
	 	<deyim>
	 while (<boolean türden ifade>);
	 
	 Akış do-while döngüsüne geldiğinde koşul kontrolü yapılmaz. İlk adım çalıştırıldıktan sonra kontrol yapılmaya başlar.
	 Yani bu döngü deyiminin en az bir kez çalıştırılacağı garanti altındadır. while döngü deyimi kadar sık kullanılmasa da
	 okunabilirliği/algılanabilirliği artırmak ve algoritmanın sadeleştirilmesi için tercih edilebilir. Ancak bu döngü
	 deyimi gereksiz yere kullanıldığında okunabilirliği/algılanabilirliği azaltır. Buna dikkat edilmelidir

 */
package orhn;

public class App {
	public static void main(String [] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int val = Integer.parseInt(kb.nextLine());
		
		int i = 0;
		
		do {
			System.out.printf("%d ", i);
			++i;
		} while (i < val);
		
		System.out.printf("%nDöngü sonrası :i =  %d%n", i);
		
	}
}
