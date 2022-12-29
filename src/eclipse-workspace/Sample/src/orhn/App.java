/*----------------------------------------------------------------------------------------------------------------------	 
	switch deyiminin genel biçimi:
	switch (<ifade>) {
		case <sabit ifadesi>:
			<deyim>
		case <sabit ifadesi>:
			<deyim>
			
		...
		
		[
		default:
			<deyim>
		]			
	}
	
	Bu deyimde parantez içerisindeki ifade temel türler için tamsayı türlerinden biri veya char türünden olabilir.
	Temel türler dışında String veya enum türlerinden de olabilir. Bu türler ileride ele alınacaktır. switch 
	deyiminin default kısmı zorunlu değildir.
	
	
	Anahrtat Notlar: switch deyimi Java 12'den itibaren ifade (expression) olarak da kullanılabilmektedir. Bu tarz 
	deyimlere/ifadelere "ifadesel deyim (expression statement)". switch'in ifade olarak kullanılmasına yönelik sentaks
	ve semantik eklentiler yapılmıştır. İleride ele alınacaktır.  
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------	 
	Aşağıdaki switch deyiminin if deyimi karşılığı:
	
	if (postalCode == 34387)
		System.out.println("Mecidiyeköy");
	else if (postalCode ==  67100)
		System.out.println("Zonguldak Bahçelievler");
	else
		System.out.println("Geçersiz posta kodu");
----------------------------------------------------------------------------------------------------------------------*/

package orhn;

public class App {
	public static void main(String [] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Posta kodunu giriniz:");
		
		int postalCode = Integer.parseInt(kb.nextLine());
		
		switch (postalCode) {
		case 414100:
			System.out.println("Gebze");
			break;
		case 37100:
			System.out.println("Kastamonu Merkez");
			break;
		default:
			System.out.println("Geçersiz posta kodu");
		}
		
		System.out.println("Tekrar yapıyor muyuz ALİ?");	
	}
}


