package bildirim;

public class SmsBildirimi implements Bildirim {
    @Override
    public void gonder(String mesaj, String hedef) {
        System.out.println("SMS gönderildi -> Numara: " + hedef + ", İçerik: " + mesaj);
    }
}
