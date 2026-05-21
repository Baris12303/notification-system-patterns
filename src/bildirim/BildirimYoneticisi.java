package bildirim;

public class BildirimYonetici {
    
    private BildirimFabrikasi fabrika;

    public BildirimYonetici() {
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
