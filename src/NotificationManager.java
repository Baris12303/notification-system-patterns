public class BildirimYoneticisi {
    public void bildirimGonder(String tip, String mesaj, String hedef) {
        if (tip.equals("EPOSTA")) {
            // E-posta gönderme işlemleri
            System.out.println("SMTP sunucusuna bağlanılıyor...");
            System.out.println("E-posta formatlanıyor...");
            System.out.println(hedef + " adresine EPOSTA gönderiliyor: " + mesaj);
        } else if (tip.equals("SMS")) {
            // SMS gönderme işlemleri
            System.out.println("SMS Ağ Geçidine bağlanılıyor...");
            System.out.println("Karakter sınırı kontrol ediliyor...");
            System.out.println(hedef + " numarasına SMS gönderiliyor: " + mesaj);
        } else if (tip.equals("PUSH")) {
            // Push bildirim işlemleri
            System.out.println("Firebase/APNS ile kimlik doğrulanıyor...");
            System.out.println("Bildirim veri paketi oluşturuluyor...");
            System.out.println(hedef + " cihazına PUSH bildirimi gönderiliyor: " + mesaj);
        } else {
            System.out.println("Bilinmeyen bildirim tipi!");
        }
    }
}
