/*----------------------------------------------------------------------------------------------------------------------
  	Paketler (packages) ve isim arama (name lookup):
	
	Aşağıdaki maddelerde aksi belirtilmediği sürece "sınıf" kavramı aslında "user defined type" olarak kullanılacaktır.
	"User defined type" olarak yalnızca sınıflar yoktur. İleride ele alacağımız yine referans türleri olan "user defined
	type"'lar için de aksi belirtilmediği sürece maddeler geçerli olacaktır
	
	Anahtar Notlar: Java kaynak kodlarını içeren ve genellikle ".java" uzantılı bir dosyaya (derlenen dosyaya)
	"derleme birimi (compilation/translation unit)" denir. Eğer Java dosyasında birden fazla sınıf söz konusu ise herbir 
	sınıf bir derleme birimi gibi düşünülebilir
	
	Paketler:
		- javac her sınıf için ayrı bir ".class" uzantılı dosya (byte code) üretir. Bu işlem sınıflar aynı Java dosyasında 
	olsa bile bu şekilde yapılır
	
	- Bir sınıf herhangi bir pakette olabilir. Bir proje içerisinde kullanılan sınıfların aynı pakette olma zorunluluğu
	yoktur
	
	- Bir ".class" dosyasının ait olduğu pakete ilişkin bir dizinde (directory) bulunması gerekir. Aslında java dosyaları
	için böyle bir zorunluluk yoktur. Ancak birçok IDE bunu kendi içinde zorunlu tutar	
	
	- Bir sınıf bulunduğu paket dışında (başka bir paketin içerisinde), paket ismi ve nokta operatörü ile kullanılabilir.
	
	- Bir paket içerisinde bildirilen bir sınıfın farklı bir paketten kullanılabilmesi için public olarak bildirilmesi
	gerekir. public olarak bildirilmeyen bir sınıf ancak aynı paketteki diğer sınıflar tarafından kullanılabilir (friendly/internal)
	
	- Farklı paketteki sınıflar için byte kodların da uygun yerde olması gerekir. Uygulamanın başlatıldığı dizin tüm
	paketlere ilişkin dizinlerin olması gereken dizindir. Ancak bu durumun da ayrıntıları ve istisnaları vardır
	
	- Uygulamada kullanılan sınıflar içerisinde bir tane main metodu olmak zorunda değildir. Ancak şüphesiz "java" 
	programına verilen byte koda ilişkin sınıfta (bu kesinlikle sınıf olmalıdır) uygun main metodunun olması gerekir.
	main metodunun aşağıdaki yapıya sahip olması gerekir:
		public static void main(String [] args)
	java programına verilen main metoduna "giriş noktası (entry point)" denir
	
	- public olarak bildirilen bir sınıfın kendi ismiyle aynı isimde bir ".java" uzantılı dosyada olması zorunludur. Bu
	durumda bir ".java" uzantılı dosyada yalnızca dosya ismiyle aynı isimde olan bir sınıf public olarak bildirilebilir
	
	-  Bir java dosyası içerisinde public sınıf olmak zorunda değildir. public sınıf olacaksa dosya ismi ile aynı 
	isimde olan sınıf ancak olabilir
	
	- Bir java dosyası içerisinde dosya ismi ile aynı isimde sınıf olmak zorunda değildir.
	
	- Bir java dosyası içerisinde public olmayan istenildiği kadar sınıf yazılabilir. Bu sınıflar aynı pakette bildirilmiş
	olur
	
	- Aynı paket içerisinde aynı isimde birden fazla sınıf bildirimi geçersizdir.
	
	- Farklı paketler içerisinde aynı isimde sınıflar olabilir
	
	- Bir java dosyası içerisindeki sınıflar o java dosyasının başında bildirilen paket içerisinde olurlar.
	
	- Bir java dosyasında farklı paket bildirimleri yapılamaz
	
	- Hiç bir paket bildirimi olmayan java dosyalarında bildirilen sınıflar "isimsiz paket (unnamed package)" denilen
	bir paket içerisinde kabul edilirler. Ancak projelerde isimsiz paket içerisinde sınıf bildirimi yapılmamalıdır
	
	- Bir paket içerisinde alt paketler (sub package) olabilir. Alt paketler
	
		package <paket ismi>.<alt paket ismi>.<alt paket ismi> ...
				
	biçiminde bildirilir. Alt paketlerde bulunan sınıfların .class dosyaları paket hiyerarşisine ilişkin uygun alt dizinlerde
	bulunmalıdır
	
	- Paketler içiçe bile olsa farklı paketlerdir. Yani örneğin org.mali.util.numeric paketi içerisinde NumberUtil isimli
	bir sınıf varsa org.mali içerisinde de NumberUtil isimli bir sınıf olabilir. Bu isimler çakışmaz.
	
	- Paket isimleri genelde fimaya ilişkin tekil (unique) bir bilgi olan domain isimlerinden üretilir. Örneğin
	ORHN firmasının paketleri ve sınıfları domain ismi "orhn.org" olduğundan "org.orhn" paketi altında yazılabilir.
	Bu şekildeki yaklaşıma uyulmalıdır
	
	- Java'nın standart tüm paketleri java isimli bir paket altında toplanmıştır. java paketi altındaki paketler içerisinde
	başka paketler ve başka sınıflar bildirilmiştir
	
	- java.lang isimli paketi altında bulunan tüm sınıflar görülebilirdir (visible). Yani buradaki isimleri paket ismi
	ile kombine etmeye gerek yoktur (import bildirimi olmadan da doğrudan kullanılabilir)
	
	 
	com.orhn.app
	
---------------------------------------------------------------------------------------------------------------------*/
package com.orhn.app;

import com.orhn.math.geometry.Point;
import com.orhn.math.geometry.PointF;

class App {	
	public static void main(String [] args)
	{		
		Point p = new Point(2, 4);
		
		p.print();
		
		PointF pf = new PointF(2.3f, 3.4f);
		
		pf.print();
		
		pf.distance();
	}
}

