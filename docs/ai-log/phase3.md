# Faz 3 - AI Pair Programming Logu

**AI'a sorduğum soru (Prompt):** "Sistemde kullanıcıların belirli bildirimlere abone olabileceği, yeni bir bildirim geldiğinde sadece o abonelere toplu mesaj gidecek bir yapı kurmak istiyorum. 
Hangi davranışsal (behavioral) örüntü buna uygundur?"

**AI'ın Yanıtı:** AI, bu senaryonun tam olarak **Observer (Gözlemci)** örüntüsünün karşılığı olduğunu belirtti. 
Bir yayıncı (Subject) sınıfının abonelerin (Observers) listesini tutması ve bir değişiklik olduğunda hepsini tetiklemesi gerektiğini söyledi.

**Benim Uygulamam ve Yorumum:** AI'ın önerisi doğrultusunda `KullaniciObserver` arayüzünü ve bunu uygulayan `StandartKullanici` sınıfını yazdım. 
`BildirimYayincisi` ise aboneleri yöneten ana merkez oldu. 
AI yine kodları İngilizce vermeye meyilliydi ancak projenin başından beri koruduğum Türkçe isimlendirme ve temiz kod disiplinini burada da devam ettirdim. 
Sınıfları mimariye tamamen entegre ettim.

**İkinci Davranışsal Örüntü (Strategy) Eklentisi:** Yönergedeki "en az 2 davranışsal örüntü" şartını sağlamak için sistemi tekrar değerlendirdim. Abonelere giden mesajların Acil veya Standart olma durumlarına göre formatlarının değişmesi gerektiğini fark ettim. AI bana if-else blokları önermesine rağmen, OCP (Açık-Kapalı Prensibi) gereği **Strategy (Strateji)** örüntüsünü uygulamaya karar verdim. `MesajStratejisi` adında bir interface açarak, çalışma zamanında (run-time) `BildirimYayincisi` sınıfının davranışını dinamik olarak değiştirebilir hale getirdim.
