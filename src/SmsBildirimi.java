public class SmsBildirimi implements Bildirim {
    @Override
    public void gonder(String mesaj, String hedef) {
        System.out.println("SMS Ağ Geçidine bağlanılıyor...");
        System.out.println("Karakter sınırı kontrol ediliyor...");
        System.out.println(hedef + " numarasına SMS gönderiliyor: " + mesaj);
    }
}
