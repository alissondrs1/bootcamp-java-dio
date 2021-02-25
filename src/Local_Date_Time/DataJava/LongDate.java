package DataJava;

/** Este exemplo mostra a timeInMillis do sistema operacional.*/
import java.util.Date;

public class LongDate {
    public static void main(String[] args) {

        Long currenTimeMillis = System.currentTimeMillis();
        System.out.println(currenTimeMillis);

        Date novaData = new Date(currenTimeMillis);

        System.out.println(novaData);

    }
}
