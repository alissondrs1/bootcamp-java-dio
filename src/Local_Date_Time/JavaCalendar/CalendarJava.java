package JavaCalendar;

import java.util.Calendar;

/** Classe Calendar*/

public class CalendarJava {
    public static void main(String[] args) {

        /** Instacia a classe calendar*/
        Calendar agora = Calendar.getInstance();

        System.out.println( agora.getTime());
        //Tue Feb 16 16:08:32 BRT 2021

        /** Atribuimos o Sinal "-" para dias, meses, anos anteriores (menos 15 dias da data de hoje).*/
        agora.add(Calendar.DATE, -15);
        System.out.println("15 dias atras: " + agora.getTime());
        //15 dias atras do getTime anterior: Mon Feb 01 16:08:32 BRT 2021

        agora.add(Calendar.MONTH, 4);
        System.out.println("4 meses depois: " +"%tc\n"+ agora.getTime());
        //4 meses depois do getTime anterior: Tue Jun 01 16:08:32 BRT 2021

        agora.add(Calendar.YEAR, 2);
        System.out.println("2 anos depois: " + agora.getTime());
        //2 anos depoisdo getTime Anterior: Thu Jun 01 16:08:32 BRT 2023


    }
}
