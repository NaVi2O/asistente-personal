import java.time.LocalTime;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Scanner;

public class Consultas {
    boolean cerrar = false;

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
        System.out.println("Pues yo estoy muy contento de poder hablar contigo, y tu como estas?");

    }




}
