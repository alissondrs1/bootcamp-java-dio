package local_date;

import java.time.LocalDate;

public class DateLocal {

    public static void main(String[] args) {


        /** Cria o objeto "hoje" */
        LocalDate hoje = LocalDate.now();
        /** Cria o objeto ontem, e implementamos "hoje - 1(minusDays(1)) " para retornar o dia de ontem*/
        LocalDate ontem = hoje.minusDays(1);

        System.out.println(hoje);
        //2021-02-16
        System.out.println(ontem);
        //2021-02-15

    }
}
