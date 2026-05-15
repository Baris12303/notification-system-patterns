# Faz 1 - AI Pair Programming Logu

**AI'a sorduğum soru (Prompt):** "Şu an BildirimYoneticisi sınıfımın içi if-else dolu. Yeni bir bildirim tipi eklendiğinde kodu değiştirmek istemiyorum. 
Sadece nesne üretimini nasıl daha temiz hale getirebilirim? Hangi creational pattern uygun?"

**AI'ın Yanıtı:** AI, nesne üretim sorumluluğunu asıl iş mantığından ayırmak için **Factory Method** kullanmamı önerdi. 
Bir arayüz (Interface) tanımlayıp, her bildirim tipini kendi sınıfına almamı, üretimi de bir Fabrika sınıfına devretmemi söyledi.

**Benim Uygulamam ve Yorumum:** AI'ın önerdiği Factory Method mantığını mantıklı buldum ve uyguladım. 
Ortak bir `Bildirim` interface'i açıp `EpostaBildirimi`, `SmsBildirimi` gibi alt sınıflar oluşturdum. 
Ancak AI bana kodun tamamını İngilizce isimlendirmelerle verdi. 
Ben projeyi tamamen anladığımı göstermek ve kendi mantığıma oturtmak için sınıfları ve metodları kendim Türkçe yazarak uyguladım.
