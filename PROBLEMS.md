# Başlangıç Kodunun Tasarım Sorunları

1. **Tek Sorumluluk Prensibi (SRP) İhlali:** `BildirimYoneticisi` sınıfı hem e-posta sunucusuna bağlanmayı, hem SMS sistemini yönetmeyi hem de Push bildirimlerini atmayı üstlenmiş. Sınıfın değişmek için birden fazla nedeni var.
2. **Açık/Kapalı Prensibi (OCP) İhlali:** Sisteme yeni bir bildirim türü eklemek istediğimizde mevcut `BildirimYoneticisi` kodunu değiştirmek (yeni bir `else if` eklemek) zorundayız. Kod gelişime açık, değişime kapalı değil.
3. **Spagetti Kod:** Tüm mantık tek bir metodun (`bildirimGonder`) içine if-else bloklarıyla yığılmış. Kod büyüdükçe okunabilirliği ve bakımı zorlaşacak.
4. **Kod Tekrarı Potansiyeli:** Loglama veya hata yakalama gibi ortak işlemler her if bloğunun içine ayrı ayrı yazılmaya çok müsait bir yapıda.
5. **Test Edilebilirlik Sorunu:** E-posta, SMS ve Push gönderim mantıkları aynı sınıfa sıkı sıkıya bağlı olduğu için, örneğin sadece SMS mantığını izole edip birim (unit) testi yazmak zor.
