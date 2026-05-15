public class BildirimYoneticisi {
    private BildirimFabrikasi fabrika;

    public BildirimYoneticisi() {
        this.fabrika = new BildirimFabrikasi();
    }

    public void bildirimGonder(String tip, String mesaj, String hedef) {
        Bildirim bildirim = fabrika.bildirimOlustur(tip);
        bildirim.gonder(mesaj, hedef);
    }
}
