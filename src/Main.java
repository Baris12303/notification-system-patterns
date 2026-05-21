import bildirim.*;
import observer.*;
import strateji.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 1. FABRİKA, ADAPTÖR VE DEKORATÖR TESTİ ===");
        BildirimFabrikasi fabrika = new BildirimFabrikasi();

        Bildirim eposta = fabrika.bildirimOlustur("EPOSTA");
        eposta.gonder("Kullanıcı kaydınız onaylandı.", "baris@email.com");

        Bildirim whatsapp = fabrika.bildirimOlustur("WHATSAPP");
        whatsapp.gonder("Doğrulama kodunuz: 5542", "+905551112233");

        System.out.println("\n=== 2. OBSERVER VE STRATEGY TESTİ ===");
        BildirimYayincisi yayinci = new BildirimYayincisi();

        KullaniciObserver k1 = new StandartKullanici("Barış");
        KullaniciObserver k2 = new StandartKullanici("Ahmet");

        yayinci.aboneEkle(k1);
        yayinci.aboneEkle(k2);

        yayinci.topluBildirimGonder("Yarınki sınav saati uzatılmıştır.");

        yayinci.setStrateji(new AcilMesajStratejisi());
        yayinci.topluBildirimGonder("Sistem bakımı 10 dakika içinde başlayacaktır!");
    }
}
