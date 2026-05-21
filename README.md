# Bildirim Sistemi - Tasarım Örüntüleri Projesi

Bu proje, bir bildirim yönetim sisteminin SOLID prensipleri ve GoF Tasarım Örüntüleri kullanılarak nasıl refactor edilebileceğini ve genişletilebileceğini göstermektedir.

**Seçilen Konu:** A — Bildirim Sistemi

**Gerekçe:** Tüm bildirim tiplerini tek bir `if-else` zincirine gömen yapıyı, her tipin kendi sınıfına sahip olduğu ve kolayca genişletilebilen bir mimariye dönüştürmek istedim. Bu seçim Factory, Adapter, Decorator, Observer ve Strategy örüntülerini doğal bir akışla uygulamama imkân tanıdı.

---

## Uygulanan Tasarım Örüntüleri

| Faz | Örüntü | Açıklama |
|-----|--------|----------|
| Creational | **Factory Method** | Bildirim nesnelerinin merkezi ve tip-bağımsız üretimi |
| Structural | **Adapter** | Uyumsuz WhatsApp 3. parti API'sinin sisteme entegrasyonu |
| Structural | **Decorator** | Mevcut bildirimlere dokunmadan dinamik loglama eklenmesi |
| Behavioral | **Observer** | Dinamik abone yönetimi ve toplu yayın altyapısı |
| Behavioral | **Strategy** | Runtime'da değiştirilebilir mesaj formatlama davranışı |

Tüm örüntü detayları, UML diyagramları ve neden tercih edildikleri `PATTERNS.md` dosyasında belgelenmiştir. Geliştirme süreci AI Pair Programming ile yürütülmüş olup tartışma günlükleri `docs/ai-log/` dizininde bulunmaktadır.

---

## Proje Klasör Yapısı

```
notification-system-patterns/
│
├── .github/workflows/ci.yml  ← GitHub Actions: derleme + çalıştırma
│
├── docs/
│   ├── ai-log/
│   │   ├── phase1.md         ← Faz 1 AI Pair Programming günlüğü
│   │   ├── phase2.md         ← Faz 2 AI Pair Programming günlüğü
│   │   └── phase3.md         ← Faz 3 AI Pair Programming günlüğü
│   └── diagrams/
│       └── final_uml.md      ← Mermaid ile nihai UML diyagramı
│
├── src/
│   ├── bildirim/             ← Çekirdek arayüz + Factory + somut bildirimler
│   ├── adaptor/              ← WhatsApp Adapter Pattern
│   ├── dekorator/            ← Decorator Pattern (loglama)
│   ├── observer/             ← Observer Pattern (abone yönetimi)
│   ├── strateji/             ← Strategy Pattern (mesaj formatlama)
│   └── Main.java             ← Tüm sistemi çalıştıran demo sınıfı
│
├── PATTERNS.md               ← Her örüntünün belgelenmesi + UML diyagramları
├── PROBLEMS.md               ← Başlangıç kodunun analizi (Faz 0)
└── README.md                 ← Bu dosya
```

---

## Nasıl Çalıştırılır

**Gereksinim:** Java 17 veya üzeri

```bash
# 1. Repoyu klonla
git clone https://github.com/KULLANICI_ADI/notification-system-patterns.git
cd notification-system-patterns

# 2. Derle
mkdir -p out
javac -d out -sourcepath src \
  src/bildirim/*.java \
  src/adaptor/*.java \
  src/dekorator/*.java \
  src/observer/*.java \
  src/strateji/*.java \
  src/Main.java

# 3. Çalıştır
java -cp out Main
```

**Beklenen çıktı:**
```
=== 1. FABRİKA, ADAPTÖR VE DEKORATÖR TESTİ ===
[LOG] Bildirim işlemi başlatıldı. Hedef: baris@email.com
E-posta gönderildi -> Alıcı: baris@email.com, İçerik: Kullanıcı kaydınız onaylandı.
[LOG] Bildirim işlemi başarıyla tamamlandı.

[LOG] Bildirim işlemi başlatıldı. Hedef: +905551112233
WhatsApp API'ye bağlanılıyor...
+905551112233 nolu telefona WP mesajı gitti: Doğrulama kodunuz: 5542
[LOG] Bildirim işlemi başarıyla tamamlandı.

=== 2. OBSERVER VE STRATEGY TESTİ ===
[SİSTEM] Tüm abonelere toplu bildirim gönderiliyor...
Barış adlı aboneye mesaj ulaştı: [BİLGİLENDİRME] Yarınki sınav saati uzatılmıştır.
Ahmet adlı aboneye mesaj ulaştı: [BİLGİLENDİRME] Yarınki sınav saati uzatılmıştır.

[SİSTEM] Tüm abonelere toplu bildirim gönderiliyor...
Barış adlı aboneye mesaj ulaştı: *** DİKKAT ACİL ***
...
```
