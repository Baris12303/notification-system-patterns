package dekorator;

import bildirim.Bildirim;

public abstract class BildirimDekoratoru implements Bildirim {
    protected Bildirim sarilanBildirim;

    public BildirimDekoratoru(Bildirim bildirim) {
        this.sarilanBildirim = bildirim;
    }

    @Override
    public void gonder(String mesaj, String hedef) {
        sarilanBildirim.gonder(mesaj, hedef);
    }
}
