package DataJava;

import java.util.Date;

public class CompateToEquals {

    public static void main(String[]args){

        Date dataNoPassado = new Date(786047421);
        System.out.println(dataNoPassado);


        Date dataNoFuturo = new Date(1613846492);

        Date mesmadataNoFuturo = new Date(1613846492);

        /** Compara se dataNoFuturo e mesmadataNoFuturo são iguais
         *  O método equals retorna um valor booleno, se as datas
         *  forem iguais "true" se as datas forem diferente "false"*/
        boolean isEquals = dataNoFuturo.equals(mesmadataNoFuturo);

        System.out.println(isEquals);

        /** O métodoCompareTo compara as duas datas e nos retorna um valor do tipo inteiro.
         *  Esses 3 cases fazem a comparação entre as datas referencial, compara as duas datas
         *  e retorna o valor anterior (-1), valor posterior (1) e datas iguais (0)*/
        int compareCase = dataNoPassado.compareTo(dataNoFuturo); // passado para o futuro

        int compareCase1 = dataNoFuturo.compareTo(dataNoPassado); //futuro para o passado

        int compareCase2 = dataNoFuturo.compareTo(dataNoFuturo); // datas equivalentes

        System.out.println(compareCase);// -1

        System.out.println(compareCase1);// 1

        System.out.println(compareCase2);// 0


    }
}
