package DataJava;
import java.util.Date;
/**
 * Exemplo usando os métodos after e before
 */
public class AfterBefore {

    public static void main(String[]args){

        Date dataNoPassado = new Date(1582224092);

        Date dataNoFuturo = new Date(1613846492);

        /**Compara se dataNoPassado() e posterior a dataNoFuturo()*/

        boolean isAfter = dataNoPassado.after(dataNoFuturo);
        System.out.println(isAfter);

        /**Compara se a dataNoPassado() é anterior a dataNoFuturo()*/
        boolean isBefore = dataNoPassado.before(dataNoFuturo);

        System.out.println(isBefore);
    }

}

