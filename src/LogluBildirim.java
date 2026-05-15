public class LogluBildirim extends BildirimDekoratoru {

    public LogluBildirim(Bildirim bildirim) {
        super(bildirim);
    }

    @Override
    public void gonder(String mesaj, String hedef) {
        System.out.println("[LOG] Bildirim işlemi başlatıldı. Hedef: " + hedef);
        
        super.gonder(mesaj, hedef);
        
        System.out.println("[LOG] Bildirim işlemi başarıyla tamamlandı.\n");
    }
}
