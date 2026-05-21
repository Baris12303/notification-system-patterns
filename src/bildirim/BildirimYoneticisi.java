package bildirim;

// BildirimYoneticisi: Fabrika'yi kullanarak bildirim gonderme isini organize eder.
// Bu sinif dogrudan nesne uretmiyor; uretimi BildirimFabrikasi'na devrediyor (SRP).
public class BildirimYoneticisi {
    
    private BildirimFabrikasi fabrika;

    public BildirimYoneticisi() {
        this.fabrika = new BildirimFabrikasi();
    }

    public void bildirimGonder(String tip, String mesaj, String hedef) {
        try {
            Bildirim bildirim = fabrika.bildirimOlustur(tip);
            bildirim.gonder(mesaj, hedef);
        } catch (IllegalArgumentException e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }
}
