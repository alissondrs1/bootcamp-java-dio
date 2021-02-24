package local_time;

import java.time.LocalTime;

public class TimeLocal {
    public static void main(String[] args) {
        LocalTime agora = LocalTime.now();

        System.out.println(agora);
        //19:08:21.165138400

        /** Adiciona 1 hora ao time de referência*/
        LocalTime maisUmaHora = agora.plusHours(1);
        System.out.println(maisUmaHora);
    }
}
