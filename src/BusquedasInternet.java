import java.util.Scanner;
import java.awt.Desktop;
import java.net.URI;

public class BusquedasInternet {

    Scanner sc = new Scanner(System.in);


    public void BusquedaYoutube(){
        try {
            int aleatoriedad = (int)(Math.random() * 4);

            if(aleatoriedad == 0){
                System.out.println("Disculpeme, pero que quieres buscar, ponga solo lo que quiere buscar");
            }
            else if (aleatoriedad == 1) {
                System.out.println("¿Qué quiere buscar? Escriba únicamente el tema que le interese");
            }
            else if (aleatoriedad == 2) {
                System.out.println("Introduzca el contenido que quiere buscar, por favor");
            }
            else if (aleatoriedad == 3){
                System.out.println("Escriba lo que desea buscar y procederé a realizar la búsqueda");
            }

            String preguntaYoutube = sc.nextLine();

            String preguntaYoutubeBusqueda = preguntaYoutube.replace(" ","%20");

            String url = "https://www.youtube.com/results?search_query=" + preguntaYoutubeBusqueda;
            Desktop.getDesktop().browse(new URI(url));

            System.out.println("Buscando en YouTube: " + preguntaYoutube);
        } catch (Exception e) {
            System.out.println("No se pudo abrir el navegador.");
            e.printStackTrace();
        }
    }

    public void BusquedaNavegador(){
        try {
            int aleatoriedad = (int)(Math.random() * 4);

            if(aleatoriedad == 0){
                System.out.println("Disculpeme, pero que quieres buscar, ponga solo lo que quiere buscar");
                }
            else if (aleatoriedad == 1) {
                System.out.println("¿Qué quiere buscar? Escriba únicamente el tema que le interese");
                }
            else if (aleatoriedad == 2) {
                System.out.println("Introduzca el contenido que quiere buscar, por favor");
                }
            else if (aleatoriedad == 3){
                System.out.println("Escriba lo que desea buscar y procederé a realizar la búsqueda");
            }

            String preguntaNavegador = sc.nextLine();
            String preguntaNavegadorBusqueda = preguntaNavegador.replace(" ","%20");

            String url = "https://www.google.com/search?q=" + preguntaNavegadorBusqueda;
            Desktop.getDesktop().browse(new URI(url));

            System.out.println("Buscando en Google: " + preguntaNavegador);
        } catch (Exception e) {
            System.out.println("No se pudo abrir el navegador.");
            e.printStackTrace();
        }
    }
}
