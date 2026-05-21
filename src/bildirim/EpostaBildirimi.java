package bildirim;

public class EpostaBildirimi implements Bildirim {
    @Override
    public void gonder(String mesaj, String hedef) {
        System.out.println("E-posta gönderildi -> Alıcı: " + hedef + ", İçerik: " + mesaj);
    }
}
