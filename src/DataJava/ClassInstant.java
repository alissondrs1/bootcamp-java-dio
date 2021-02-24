package DataJava;

import java.time.Instant;
import java.util.Date;

public class ClassInstant {

    public static void main(String[] args) {
        Date dataInicio = new Date(786031504);
        System.out.println(dataInicio);

        Instant instant = dataInicio.toInstant();
        System.out.println(instant);

    }
}
