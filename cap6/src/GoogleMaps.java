import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class GoogleMaps implements Mapa
{
    @Override
    public String devolveMapa(String rua) {

        try {
            String googleMaps = "https://maps.google.com.br/maps?q=rua+castelo+branco";
            URL url = new URL(googleMaps);
            InputStream openStream = url.openStream();
            //...
            return "mapa";
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
