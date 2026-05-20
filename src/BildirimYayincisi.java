import java.util.ArrayList;
import java.util.List;

public class BildirimYayincisi {
    private List<KullaniciObserver> aboneler = new ArrayList<>();
    private MesajStratejisi strateji;

    public BildirimYayincisi() {
        this.strateji = new StandartMesajStratejisi();
    }

    public void setStrateji(MesajStratejisi strateji) {
        this.strateji = strateji;
    }

    public void aboneEkle(KullaniciObserver abone) {
        aboneler.add(abone);
    }

    public void aboneCikar(KullaniciObserver abone) {
        aboneler.remove(abone);
    }

    public void topluBildirimGonder(String mesaj) {
        String formatlanmisMesaj = strateji.formatla(mesaj);
        
        System.out.println("\n[SİSTEM] Tüm abonelere toplu bildirim gönderiliyor...");
        for (KullaniciObserver abone : aboneler) {
            abone.bildirimAl(formatlanmisMesaj);
        }
    }
}
