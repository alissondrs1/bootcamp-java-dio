package ColletionseStreams.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploSet {
    public static void main(String[] args) {
        Set<Double> notasAlunos = new HashSet<>();

        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);

        System.out.println(notasAlunos);

        notasAlunos.remove(3.8);

        System.out.println("Lista sem a nota'3.8'\n" + notasAlunos);

        System.out.println("\nTamanho do vetor.\n"+ notasAlunos.size());

        System.out.println("\n(->) Lista iterator | (-->) Lista for eith");

        Iterator<Double> iterator = notasAlunos.iterator();
        while ( iterator.hasNext()){
            System.out.println("->" + iterator.next());
        }
        for (Double nota: notasAlunos){
            System.out.println("-->" + nota);
        }

        System.out.println("Limpando as notas com .clear\n");
        notasAlunos.clear();
        System.out.println(notasAlunos);


        System.out.println("\nA lista esta vazia?");
        System.out.println("Estado: " + notasAlunos.isEmpty());

        if (notasAlunos.isEmpty() == true ){
            System.out.println("Sim, está vazia. ");
        }else {
            System.out.println("Ops!... Tem alguma coisa na lista!");
        }

    }

}
