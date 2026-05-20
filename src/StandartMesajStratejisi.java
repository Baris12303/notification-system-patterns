public class StandartMesajStratejisi implements MesajStratejisi {
    @Override
    public String formatla(String mesaj) {
        return "[BİLGİLENDİRME] " + mesaj;
    }
}
