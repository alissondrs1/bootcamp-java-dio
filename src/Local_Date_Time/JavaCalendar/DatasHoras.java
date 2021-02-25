package JavaCalendar;

/** Algumas conversões */
import java.util.Calendar;

public class DatasHoras {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();

        System.out.printf("%tc\n", agora);
        //ter fev 16 16:58:24 BRT 2021

        System.out.printf("%tF\n", agora);
        //2021-02-16

        System.out.printf("%tD\n", agora);
        //02/16/21

        System.out.printf("%tr\n", agora);
        //04:58:24 PM

        System.out.printf("%tT\n", agora);
        //16:58:24

    }
}
