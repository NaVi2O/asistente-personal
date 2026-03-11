import java.time.LocalTime;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Scanner;

public class Consultas {

    LocalTime horario = LocalTime.now();
    LocalDate fecha = LocalDate.now();
    Scanner sc = new Scanner(System.in);


    int hora = horario.getHour();
    DayOfWeek dia = fecha.getDayOfWeek();

    public Consultas(){}

    public void Saludo(){
        if(hora >= 6 && hora< 12){
            System.out.println("Buenos dias, que deseas saber hoy?");
        } else if (hora >= 12 && hora < 20) {
            System.out.println("Buenas tardes, que desea saber hoy?");
        } else {
            System.out.println("Buenas noches, que desea saber hoy?");
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

    //Se puede mejorar haciendo que depede de un int diga una cosa u otra
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




}
