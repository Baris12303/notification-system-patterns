public class BildirimFabrikasi {
    public Bildirim bildirimOlustur(String tip) {
        if (tip.equalsIgnoreCase("EPOSTA")) {
            return new EpostaBildirimi();
        } else if (tip.equalsIgnoreCase("SMS")) {
            return new SmsBildirimi();
        } else if (tip.equalsIgnoreCase("PUSH")) {
            return new PushBildirimi();
        }
        throw new IllegalArgumentException("Bilinmeyen bildirim tipi: " + tip);
    }
}
