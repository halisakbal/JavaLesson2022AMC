/*----------------------------------------------------------------------------------------------------------------------	 
	Sınıf Çalışması: Klavyeden kullanıcı adı ve şifre isteyen basit bir ATM uygulamasının bir parçasını aşağıdaki
	açıklmalara göre yazınız.
	Açıklamalar:
	- Kullanıcı ad ve şifresi en fazla 3(üç) kez denenebilecektir.
	
	- Denemeler sırasında doğru giriş yapılırsa "Giriş başarılı", başarısız denemeler "Giriş başarız" yazısı basılacaktır
	
	- En fazla 3 deneme sonucunde başarısız olunmuşsa "Giriş başarısız. Artık deneme hakkınız biti!..." yazısı basılacaktır
	
	- Uygulama adı ve şifrenin doğruluğu program içerisinde belirlene bir kullanıcı adı ve şifre ile yapılacaktır.
	
	- Uygulama genel düşünerek yazılmalıdır
	
	- ATM uygulamasının sürekli çalıştığı varsayımıyla yazılması önerilir
----------------------------------------------------------------------------------------------------------------------*/

package orhn;

class App {	
	public static void main(String [] args)
	{	
		AtmApp.run(3);
	}
}

class AtmApp{
	
	public static void doSucces(AtmCard atmCard, java.util.Scanner kb)
	{
		System.out.println("-----------------------------------");
		System.out.println("Giriş başarılı");
		System.out.println("-----------------------------------");
	}
	
	public static void doFail(AtmCard atmCard, java.util.Scanner kb)
	{
		System.out.println("-----------------------------------");
		System.out.println("Giriş başarısız. Artık deneme hakkınız bitti!....");
		System.out.println("-----------------------------------");
	}
	
	public static void doWorkForCard(AtmCard atmCard, int tryNum, java.util.Scanner kb)
	{
		int i = 0;
		
		for (;  i < tryNum; ++i) {
			System.out.print("Kullanıcı adını giriniz : ");
			String username = kb.nextLine();
			System.out.print("Şifrenizi giriniz : ");
			String password = kb.nextLine();
			
			if(atmCard.isvalid(username, password))
				break;
			
			if(i != tryNum - 1)
				System.out.printf("Giriş başarısız. %d giriş hakkınız kaldı!...%n", tryNum -1 - i);
			
		}
		
		if(i != tryNum)
			doSucces(atmCard, kb);
		else
			doFail(atmCard, kb);
		
	}
	
	public static void run(int tryNum)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for(;;) {
			System.out.println("Hoş geldiniz!...");
			AtmCard atmCard = new AtmCard();
			
			doWorkForCard(atmCard, tryNum, kb);
		}
	}
}


class AtmCard{
	public String username;
	public String password;
	
	public AtmCard()
	{
		username = "orhan";
		password = "2023";
	}
	
	public boolean isvalid(String uname, String passwd)
	{
		return uname.equals(username) && passwd.equals(password);
	}
}

