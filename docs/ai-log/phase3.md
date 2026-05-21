# Faz 3 - AI Pair Programming Logu

**AI'a sorduğum soru (Prompt):** "Sistemde kullanıcıların belirli bildirimlere abone olabileceği, yeni bir bildirim geldiğinde sadece o abonelere toplu mesaj gidecek bir yapı kurmak istiyorum. Hangi davranışsal (behavioral) örüntü buna uygundur?"

**AI'ın Yanıtı:** AI, bu senaryonun tam olarak **Observer (Gözlemci)** örüntüsünün karşılığı olduğunu belirtti.
Bir yayıncı (Subject) sınıfının abonelerin (Observers) listesini tutması ve bir değişiklik olduğunda hepsini tetiklemesi gerektiğini söyledi.

**Benim Uygulamam ve Yorumum:** AI'ın önerisi doğrultusunda `KullaniciObserver` arayüzünü ve bunu uygulayan `StandartKullanici` sınıfını yazdım.
`BildirimYayincisi` ise aboneleri yöneten ana merkez oldu.
AI yine kodları İngilizce vermeye meyilliydi ancak projenin başından beri koruduğum Türkçe isimlendirme ve temiz kod disiplinini burada da devam ettirdim.
Sınıfları mimariye tamamen entegre ettim.

---

## Strategy Pattern Kararı

Faz 3'te bir behavioral pattern daha eklemeye karar verdim: **Strategy**.
AI'a şunu sordum: "Observer'ın içinde mesajları farklı formatlarda göndermenin bir yolunu arıyorum. if-else yazmak istemiyorum. Ne önerirsin?"

AI Strategy pattern'i önerdi. Mesaj formatlama davranışını `MesajStratejisi` arayüzü arkasına sakladım.
`StandartMesajStratejisi` ve `AcilMesajStratejisi` sınıflarını yazdım; `BildirimYayincisi` bunları runtime'da `setStrateji()` metoduyla değiştirebiliyor.

---

## Geriye Dönük Değerlendirme

**"AI olmadan bu faz ne kadar sürerdi?"**
Observer ve Strategy'yi kavramsal olarak bilsem de doğru bağlamda nasıl birleştireceğimi bulmak muhtemelen 2-3 saat daha alırdı. AI sayesinde bu süreyi yaklaşık yarıya indirdim; asıl zamanımı kodun Türkçeleştirilmesine ve kendi mantığıma oturtulmasına harcadım.

**"AI sizi nerede yanılttı?"**
AI ilk başta Observer ve Strategy'yi iki ayrı sınıf hiyerarşisinde, birbirinden kopuk tutmamı önerdi. Yani `BildirimYayincisi` sadece Observer işi yapsın, Strategy'yi başka bir sınıf yönetsin dedi. Ama ben ikisini aynı yayıncı üzerinden konuşturmak istiyordum — abonelere göndermeden önce mesaj formatlanmalıydı. AI'ın önerisine uymadım; stratejiyi doğrudan `BildirimYayincisi`'na gömdüm. Bu kararın daha sade ve okunabilir olduğunu düşünüyorum.
