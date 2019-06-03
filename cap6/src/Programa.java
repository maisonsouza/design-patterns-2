import java.io.IOException;
import java.util.Calendar;

public class Programa {

    public static void main(String[] args) throws IOException {
       Mapa mapa = new GoogleMaps();
       mapa.devolveMapa("Rua Vergueiro");
       Calendar.getInstance();

        RelogioDoSistema relogio = new RelogioDoSistema();
        Calendar dataAtual = relogio.hoje();
        System.out.println(dataAtual);


    }
}
