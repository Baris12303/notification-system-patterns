# Bildirim Sistemi - Tasarım Örüntüleri Projesi

Bu proje, bir bildirim yönetim sisteminin SOLID prensipleri ve GoF Tasarım Örüntüleri kullanılarak nasıl refactor edilebileceğini ve genişletilebileceğini göstermektedir.

## Uygulanan Mimariler
* **Creational:** Factory Method (Bildirim nesnelerinin merkezi üretimi)
* **Structural:** Adapter (WhatsApp 3. parti entegrasyonu), Decorator (Dinamik loglama özelliği)
* **Behavioral:** Observer (Abonelik ve toplu yayın sistemi), Strategy (Dinamik mesaj formatlama)

Tüm örüntü detayları, UML diyagramları ve neden tercih edildikleri `PATTERNS.md` dosyasında belgelenmiştir. Geliştirme süreci AI Pair Programming ile yürütülmüş olup, tartışma günlükleri `docs/ai-log/` dizininde bulunmaktadır.

```markdown
# Esnek Bildirim Yönetim Sistemi (Design Patterns Project)

Bu proje, bir bildirim yönetim sisteminin nesne yönelimli programlama (OOP) prensipleri, **SOLID** standartları ve **GoF Tasarım Örüntüleri** kullanılarak ne kadar esnek, genişletilebilir ve modüler bir mimariye dönüştürülebileceğini kanıtlamak amacıyla geliştirilmiştir.

## 📂 Proje Klasör Yapısı

Hocamızın geri bildirimleri doğrultusunda, dağınıklığı önlemek ve kurumsal paket mimarisini yakalamak adına proje yapısı aşağıdaki gibi optimize edilmiştir:

```text
notification-system-patterns/
│
├── docs/                     # Dokümantasyon Katmanı
│   ├── ai-log/               # Yapay Zeka Çiftli Programlama Günlükleri (Faz 1-2-3)
│   └── diagrams/             # Sistem Mimari Şemaları (Mermaid)
│
├── src/                      # Kaynak Kod Katmanı (Temiz Paket Düzeni)
│   ├── bildirim/             # Çekirdek Yapılar ve Creational (Factory) Katmanı
│   ├── adaptor/              # 3. Parti Entegrasyonları (Adapter Pattern)
│   ├── dekorator/            # Dinamik Özellik Yönetimi (Decorator Pattern)
│   ├── observer/             # Dinamik Abonelik Altyapısı (Observer Pattern)
│   ├── strateji/             # Dinamik Mesaj Biçimlendirme (Strategy Pattern)
│   └── Main.java             # Tüm Sistemi Çalıştıran Test Sınıfı
│
└── README.md                 # Proje Ana Tanıtım ve Karar Belgesi
