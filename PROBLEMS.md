# Başlangıç Kodunda Gördüğüm Sorunlar

Kodu bodoslama yazınca ortaya şöyle sıkıntılar çıktı:

1. **Sınıfa çok fazla iş yükledim (SRP patlıyor):** `BildirimYoneticisi` sınıfı maşallah her şeyi yapıyor. Hem mail sunucusuna bağlanıyor, hem SMS kotasını kontrol ediyor, hem de Push atıyor. Sınıfın amacı belli değil.
2. **Yeni özellik eklemek işkence (OCP ihlali):** Yarın öbür gün "uygulama içi bildirim" de atalım deseler, mecburen bu koda girip yeni bir `else if` daha yazmam gerekecek. Yani kod, yeni gelişmelere açık değil.
3. **Spagetti koda doğru gidiyoruz:** Bütün mantık tek bir metodun (`bildirimGonder`) içine yığılmış. Şimdilik 3 tip var ama bu 10 tipe çıkarsa o metodun içi çorba olur, kimse okuyamaz.
4. **Amelelik / Kod Tekrarı:** Loglama veya bir hata yakalama (try-catch) yapacak olsam, her if bloğunun içine aynı şeyleri kopyala-yapıştır yapmam gerekecek.
5. **Test etmesi çok zor:** E-posta veya SMS gönderme kısımlarını tek başına test edemiyorum çünkü her şey `BildirimYoneticisi`nin içine sıkı sıkıya gömülmüş durumda.

---

## AI ile Durum Değerlendirmesi

**AI'a sorduğum soru:** "Bu kodda hangi tasarım sorunlarını görüyorsun? Hangi tasarım örüntüleri bu sorunları çözebilir? Her sorun için kısa bir açıklama yaz."

**AI'ın cevabı ve benim yorumum:**
AI da kodu görür görmez benim hissettiğim sıkıntıları teknik dille yüzüme vurdu. Direkt "Açık/Kapalı Prensibini (OCP) ve Tek Sorumluluk Prensibini (SRP) ezmişsin" dedi. 

Benim "kod çorbaya döner" dediğim şeye AI, "bakımı zorlaşır" dedi. Farkımız şu: Ben sadece sorunu ve acıyı gördüm, AI ise bana direkt reçete yazdı. "Nesne üretme işini toparlamak için **Factory Method**, o if-else'lerden kurtulmak için de **Strategy** pattern kullanmalısın" diyerek beni yönlendirdi. Yani teşhisimiz aynı, tedaviyi o önerdi.
