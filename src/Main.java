import java.util.Scanner;

void main() {
    String pregunta = "";

    Scanner sc = new Scanner(System.in);
    Consultas consultas = new Consultas();
    BusquedasInternet busquedasInternet = new BusquedasInternet();

    //Hago la consulta
    System.out.println();


    while(!pregunta.contains("cerrar")){

        pregunta = sc.nextLine();//Preguntar
        pregunta = pregunta.toLowerCase();//pasar a minuscula

        if(pregunta.contains("hola")||pregunta.contains("saludos")){
            consultas.Saludo();
        }

        if(pregunta.contains("dia")){
            consultas.PreguntaDia();
        }

        if(pregunta.contains("como estas")){
            consultas.ComoEstas();
        }

        if(pregunta.contains("que hora")){
            consultas.QueHora();
        }

        if(pregunta.contains("youtube")){
            busquedasInternet.BusquedaYoutube();
        }

        if(pregunta.contains("buscar") || pregunta.contains("busca")){
            busquedasInternet.BusquedaNavegador();
        }

        if(pregunta.contains("cambiar nombre")){
            consultas.CambiarNombre();
        }
    }

}
