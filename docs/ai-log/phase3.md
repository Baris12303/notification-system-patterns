# Faz 3 - AI Pair Programming Logu

**AI'a sorduğum soru (Prompt):** "Sistemde kullanıcıların belirli bildirimlere abone olabileceği, yeni bir bildirim geldiğinde sadece o abonelere toplu mesaj gidecek bir yapı kurmak istiyorum. 
Hangi davranışsal (behavioral) örüntü buna uygundur?"

**AI'ın Yanıtı:** AI, bu senaryonun tam olarak **Observer (Gözlemci)** örüntüsünün karşılığı olduğunu belirtti. 
Bir yayıncı (Subject) sınıfının abonelerin (Observers) listesini tutması ve bir değişiklik olduğunda hepsini tetiklemesi gerektiğini söyledi.

**Benim Uygulamam ve Yorumum:** AI'ın önerisi doğrultusunda `KullaniciObserver` arayüzünü ve bunu uygulayan `StandartKullanici` sınıfını yazdım. 
`BildirimYayincisi` ise aboneleri yöneten ana merkez oldu. 
AI yine kodları İngilizce vermeye meyilliydi ancak projenin başından beri koruduğum Türkçe isimlendirme ve temiz kod disiplinini burada da devam ettirdim. 
Sınıfları mimariye tamamen entegre ettim.
