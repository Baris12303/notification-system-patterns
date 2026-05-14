public class PushBildirimi implements Bildirim {
    @Override
    public void gonder(String mesaj, String hedef) {
        System.out.println("Firebase/APNS ile kimlik doğrulanıyor...");
        System.out.println("Bildirim veri paketi oluşturuluyor...");
        System.out.println(hedef + " cihazına PUSH bildirimi gönderiliyor: " + mesaj);
    }
}
