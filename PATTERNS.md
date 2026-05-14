# Uygulanan Tasarım Örüntüleri

## Faz 1: Creational Pattern
**Kullanılan Örüntü:** Factory Method

**Nerede Kullanıldı?**
`src/BildirimFabrikasi.java` sınıfında kullanıldı. Başlangıçta nesne üretimi ana yöneticinin içindeki `if-else` bloklarında yapılıyordu.

**Neden Seçildi?**
Sistemin sadece "bana bir e-posta bildirimi ver" demesi gerekiyordu. Bildirimin nasıl oluşturulduğu ana sınıfın umrunda olmamalıydı. 
Factory Method bu üretim angaryasını ana sınıftan soyutladı.

**Ne Kazandık?**
* **Tek Sorumluluk (SRP):** Artık yöneticimiz sadece bildirim yollamayı biliyor, nesne üretmeyi değil.
* **Açık/Kapalı Prensibi (OCP):** Yeni bir bildirim türü eklemek istediğimizde ana koda dokunmayacağız.

### UML Sınıf Diyagramı (Factory Method Sonrası)

```mermaid
classDiagram
  class Bildirim {
      <<interface>>
      +gonder(mesaj: String, hedef: String)
  }
  class EpostaBildirimi {
      +gonder(mesaj: String, hedef: String)
  }
  class SmsBildirimi {
      +gonder(mesaj: String, hedef: String)
  }
  class PushBildirimi {
      +gonder(mesaj: String, hedef: String)
  }
  class BildirimFabrikasi {
      +bildirimOlustur(tip: String): Bildirim
  }
  Bildirim <|.. EpostaBildirimi
  Bildirim <|.. SmsBildirimi
  Bildirim <|.. PushBildirimi
  BildirimFabrikasi ..> Bildirim : üretir
