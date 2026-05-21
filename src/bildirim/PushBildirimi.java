package bildirim;

public class PushBildirimi implements Bildirim {
    @Override
    public void gonder(String mesaj, String hedef) {
        System.out.println("Push bildirimi gönderildi -> Cihaz ID: " + hedef + ", İçerik: " + mesaj);
    }
}
