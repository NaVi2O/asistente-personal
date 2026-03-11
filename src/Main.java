import java.util.Scanner;


void main() {
    boolean cerrar = false;
    String pregunta = "";

    Scanner sc = new Scanner(System.in);
    Consultas consultas = new Consultas();

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

        }
    }








}
