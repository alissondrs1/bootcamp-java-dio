package JavaCalendar.exercicio;

/**Um Cliente tem 10 dias para pagar uma fatura após sua data de venbcimento sem que os juros sejam cobrados.
 Caso essa data caia em um sábado ou domingo, o cliente pode pagar na segunda seguinte.

 Crie uma estrutura QUE receba uma data de vencimento e calcule qunatos dias ele tem para pagar. */

import java.util.Calendar;



public class VencimentoFatura {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        c.set(Calendar.DAY_OF_MONTH, 15);
        System.out.println("Sua data de vencimento é dia "+ c.get(Calendar.DAY_OF_MONTH));


        //System.out.println(c.getTime());

        c.add(Calendar.DATE, 10);
        System.out.printf("Voce podera pagar sua fatura até o dia: %tD\n" ,c.getTime());

    }
}
