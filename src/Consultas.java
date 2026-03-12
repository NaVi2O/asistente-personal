import java.time.LocalTime;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Scanner;

public class Consultas {


    LocalDate fecha = LocalDate.now();
    Scanner sc = new Scanner(System.in);


    String nombre = "";
    DayOfWeek dia = fecha.getDayOfWeek();

    public Consultas(){}

    public void Saludo(){
        LocalTime horario = LocalTime.now();
        int hora = horario.getHour();
        String respuesta = "";



        if(hora >= 6 && hora< 12){
            System.out.println("Buenos dias, puedo saber tu nombre?");

            respuesta = sc.nextLine();
            respuesta = respuesta.toLowerCase();

            if (respuesta.equals("si") || respuesta.equals("sii") || respuesta.equals("siii")) {
                System.out.println("Cual es tu nombre?");
                nombre = sc.nextLine();
                System.out.println("Vale,"+nombre+" a partir de ahora te llamare asi");
                System.out.println("Si quisieras cambiar el nombre deberas decir [cambiar nombre]");
            }
            if (respuesta.equals("no") || respuesta.equals("noo") || respuesta.equals("nooo")) {
                System.out.println("Necesito que me des un nombre para poder referirme a ti");
                System.out.println("Cual es tu nombre?");
                nombre = sc.nextLine();
                System.out.println("Vale,"+nombre+" a partir de ahora te llamare asi");
                System.out.println("Si quisieras cambiar el nombre deberas decir [cambiar nombre]");
            }
            else{
                nombre = respuesta;
                System.out.println("Vale a partir de ahora te llamare "+nombre);
                System.out.println("Si quisieras cambiar el nombre deberas decir [cambiar nombre]");
            }


        } else if (hora >= 12 && hora < 20) {
            System.out.println("Buenas tardes, puedo saber tu nombre?");

            respuesta = sc.nextLine();
            respuesta = respuesta.toLowerCase();

            if (respuesta.equals("si") || respuesta.equals("sii") || respuesta.equals("siii")) {
                System.out.println("Cual es tu nombre?");
                nombre = sc.nextLine();
                System.out.println("Vale,"+nombre+" a partir de ahora te llamare asi");
                System.out.println("Si quisieras cambiar el nombre deberas decir [cambiar nombre]");
            }
            if (respuesta.equals("no") || respuesta.equals("noo") || respuesta.equals("nooo")) {
                System.out.println("Necesito que me des un nombre para poder referirme a ti");
                System.out.println("Cual es tu nombre?");
                nombre = sc.nextLine();
                System.out.println("Vale,"+nombre+" a partir de ahora te llamare asi");
                System.out.println("Si quisieras cambiar el nombre deberas decir [cambiar nombre]");
            }
            else{
                nombre = respuesta;
                System.out.println("Vale a partir de ahora te llamare "+nombre);
                System.out.println("Si quisieras cambiar el nombre deberas decir [cambiar nombre]");
            }
        } else {
            System.out.println("Buenas noches, puedo saber tu nombre?");

            respuesta = sc.nextLine();
            respuesta = respuesta.toLowerCase();

            if (respuesta.equals("si") || respuesta.equals("sii") || respuesta.equals("siii")) {
                System.out.println("Cual es tu nombre?");
                nombre = sc.nextLine();
                System.out.println("Vale,"+nombre+" a partir de ahora te llamare asi");
                System.out.println("Si quisieras cambiar el nombre deberas decir [cambiar nombre]");
            }
            if (respuesta.equals("no") || respuesta.equals("noo") || respuesta.equals("nooo")) {
                System.out.println("Necesito que me des un nombre para poder referirme a ti");
                System.out.println("Cual es tu nombre?");
                nombre = sc.nextLine();
                System.out.println("Vale,"+nombre+" a partir de ahora te llamare asi");
                System.out.println("Si quisieras cambiar el nombre deberas decir [cambiar nombre]");
            }
            else{
                nombre = respuesta;
                System.out.println("Vale a partir de ahora te llamare "+nombre);
                System.out.println("Si quisieras cambiar el nombre deberas decir [cambiar nombre]");
            }
        }
    }

    public void PreguntaDia(){
        if(dia == DayOfWeek.MONDAY){
            System.out.println("Hoy es lunes, que mas quieres saber?");
        } else if (dia == DayOfWeek.TUESDAY) {
            System.out.println("Hoy es martes, que mas quieres saber?");
        } else if (dia == DayOfWeek.WEDNESDAY){
            System.out.println("Hoy es miercoles, que mas quieres saber?");
        } else if (dia == DayOfWeek.THURSDAY){
            System.out.println("Hoy es jueves, que mas quieres saber?");
        } else if (dia == DayOfWeek.FRIDAY){
            System.out.println("Hoy es viernes, que mas quieres saber?");
        } else if (dia == DayOfWeek.SATURDAY){
            System.out.println("Hoy es sabado, que mas quieres saber?");
        } else if (dia == DayOfWeek.SUNDAY){
            System.out.println("Hoy es domingo, que mas quieres saber?");
        }
    }

    public void ComoEstas(){
        String consultaComoEstas;
        int aleatoriedad = (int)(Math.random() * 4);

        if (aleatoriedad == 0){
            System.out.println("Pues yo estoy muy contento de poder hablar contigo, y tu como estas?");
        } else if (aleatoriedad == 1){
            System.out.println("Todo va bien por aqui, y tu como estas?");
        } else if (aleatoriedad == 2){
            System.out.println("Yo estoy bien gracias, y tu como estas hoy?");
        } else if ( aleatoriedad == 3){
            System.out.println("Estoy bastante bien ahora mismo, y tu que como te encuentas hoy?");
        }

        consultaComoEstas = sc.nextLine();
        consultaComoEstas = consultaComoEstas.toLowerCase();

        if (consultaComoEstas.contains("bien") || consultaComoEstas.contains("genial") ||
                consultaComoEstas.contains("perfecto") || consultaComoEstas.contains("guay") ||
                consultaComoEstas.contains("estupendo") || consultaComoEstas.contains("todo bien")){

            aleatoriedad = (int)(Math.random() * 4);

            if(aleatoriedad == 0){
                System.out.println("Me alegro de que estes bien, quieres saber algo mas?");
            } else if (aleatoriedad == 1) {
                System.out.println("Me alegra saber que todo va bien, quieres saber algo mas?");
            } else if (aleatoriedad == 2) {
                System.out.println("¡Genial! Me alegra escuchar eso, quieres saber algo mas?");
            } else if (aleatoriedad == 3) {
                System.out.println("Perfecto, me alegro mucho por ti, quieres saber algo ams?");
            }


        } else if (consultaComoEstas.contains("mal") || consultaComoEstas.contains("regular") ||
                consultaComoEstas.contains("fatal") || consultaComoEstas.contains("triste") ||
                consultaComoEstas.contains("cansado")){

            aleatoriedad = (int)(Math.random() * 4);

            if(aleatoriedad == 0){
                System.out.println("Vaya, siento oír eso. Espero que mejore pronto, quieres saber algo mas?");
            } else if (aleatoriedad == 1) {
                System.out.println("Animo, seguro que las cosas mejoran, quieres saber algo mas?");
            } else if (aleatoriedad == 2) {
                System.out.println("Lo siento, ojala poder ayudarte, quieres saber algo mas?");
            } else if (aleatoriedad == 3) {
                System.out.println("Vaya lo siento mucho, espero que tu día mejore pronto, quieres saber algo ams?");
            }

        }
    }

    public void QueHora(){
        LocalTime horario = LocalTime.now();
        int minuto = horario.getMinute();
        int hora = horario.getHour();
        System.out.println("Pues son las "+hora+"//"+minuto);
    }

    public void CambiarNombre(){
        System.out.println("Cual quieres que sea tu nuevo nombre? ");
        nombre = sc.nextLine();
    }





}
