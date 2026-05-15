public class WhatsAppAdaptoru implements Bildirim {
    private WhatsAppServisi wpServisi;

    public WhatsAppAdaptoru() {
        this.wpServisi = new WhatsAppServisi();
    }

    @Override
    public void gonder(String mesaj, String hedef) {
        wpServisi.sendMessage(hedef, mesaj);
    }
}
