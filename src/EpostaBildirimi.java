public class EpostaBildirimi implements Bildirim {
    @Override
    public void gonder(String mesaj, String hedef) {
        System.out.println("SMTP sunucusuna bağlanılıyor...");
        System.out.println("E-posta formatlanıyor...");
        System.out.println(hedef + " adresine EPOSTA gönderiliyor: " + mesaj);
    }
}
