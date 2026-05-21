package strateji;

public class AcilMesajStratejisi implements MesajStratejisi {
    @Override
    public String formatla(String mesaj) {
        return "*** DİKKAT ACİL ***\n" + mesaj.toUpperCase() + "\n*******************";
    }
}
