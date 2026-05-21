package observer;

public class StandartKullanici implements KullaniciObserver {
    private String isim;

    public StandartKullanici(String isim) {
        this.isim = isim;
    }

    @Override
    public void bildirimAl(String mesaj) {
        System.out.println(isim + " adlı aboneye mesaj ulaştı: " + mesaj);
    }
}
