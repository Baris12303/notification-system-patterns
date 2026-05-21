package bildirim;

import adaptor.WhatsAppAdaptoru;
import dekorator.LogluBildirim;

public class BildirimFabrikasi {
    public Bildirim bildirimOlustur(String tip) {
        Bildirim temelBildirim;
        
        if (tip.equalsIgnoreCase("EPOSTA")) {
            temelBildirim = new EpostaBildirimi();
        } else if (tip.equalsIgnoreCase("SMS")) {
            temelBildirim = new SmsBildirimi();
        } else if (tip.equalsIgnoreCase("PUSH")) {
            temelBildirim = new PushBildirimi();
        } else if (tip.equalsIgnoreCase("WHATSAPP")) {
            temelBildirim = new WhatsAppAdaptoru();
        } else {
            throw new IllegalArgumentException("Bilinmeyen bildirim tipi: " + tip);
        }
        
        return new LogluBildirim(temelBildirim);
    }
}
