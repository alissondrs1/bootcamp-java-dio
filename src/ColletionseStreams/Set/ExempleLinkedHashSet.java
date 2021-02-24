package ColletionseStreams.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExempleLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> sequenciaNumber = new LinkedHashSet<>();
        sequenciaNumber.add(200);

        sequenciaNumber.add(510);
        sequenciaNumber.add(3);
        sequenciaNumber.add(220);
        sequenciaNumber.add(1000);
        sequenciaNumber.add(4);
        sequenciaNumber.add(202);



        System.out.println(sequenciaNumber);

        sequenciaNumber.remove(18);

        System.out.println("Lista sem a nota'18'\n" + sequenciaNumber);

        System.out.println("\nTamanho do vetor.\n"+ sequenciaNumber.size());

        System.out.println("\n(->) Lista iterator | (-->) Lista for eith");

        Iterator<Integer> iterator = sequenciaNumber.iterator();
        while ( iterator.hasNext()){
            System.out.println("->" + iterator.next());
        }
        for (Integer number: sequenciaNumber){
            System.out.println("-->" + number);
        }

        System.out.println("Limpando os numeros com .clear\n");
        sequenciaNumber.clear();
        System.out.println(sequenciaNumber);


        System.out.println("\nA lista esta vazia?");
        System.out.println("Estado: " + sequenciaNumber.isEmpty());

        if (sequenciaNumber.isEmpty() == true ){
            System.out.println("Sim, está vazia. ");
        }else {
            System.out.println("Ops!... Tem alguma coisa na lista!");
        }

    }
}
