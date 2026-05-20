# Bildirim Sistemi - Tasarım Örüntüleri Projesi

Bu proje, bir bildirim yönetim sisteminin SOLID prensipleri ve GoF Tasarım Örüntüleri kullanılarak nasıl refactor edilebileceğini ve genişletilebileceğini göstermektedir.

## Uygulanan Mimariler
* **Creational:** Factory Method (Bildirim nesnelerinin merkezi üretimi)
* **Structural:** Adapter (WhatsApp 3. parti entegrasyonu), Decorator (Dinamik loglama özelliği)
* **Behavioral:** Observer (Abonelik ve toplu yayın sistemi), Strategy (Dinamik mesaj formatlama)

Tüm örüntü detayları, UML diyagramları ve neden tercih edildikleri `PATTERNS.md` dosyasında belgelenmiştir. Geliştirme süreci AI Pair Programming ile yürütülmüş olup, tartışma günlükleri `docs/ai-log/` dizininde bulunmaktadır.
