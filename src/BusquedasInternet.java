import java.util.Scanner;
import java.awt.Desktop;
import java.net.URI;

public class BusquedasInternet {

    Scanner sc = new Scanner(System.in);

    public void BusquedaYoutube(){
        try {
            System.out.println("Disculpeme, pero que quieres buscar, ponga solo lo que quiere buscar");
            String preguntaYoutube = sc.nextLine();

            String preguntaYoutubeBusqueda = preguntaYoutube.replace(" ","");

            String url = "https://www.youtube.com/results?search_query=" + preguntaYoutubeBusqueda;
            Desktop.getDesktop().browse(new URI(url));

            System.out.println("Buscando en YouTube: " + preguntaYoutube);
        } catch (Exception e) {
            System.out.println("No se pudo abrir el navegador.");
            e.printStackTrace();
        }
    }
}
