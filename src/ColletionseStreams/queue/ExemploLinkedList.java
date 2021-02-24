package ColletionseStreams.queue;

import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;

public class ExemploLinkedList {


    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);



        String clienteAserAtendido = filaBanco.poll();

        System.out.println(clienteAserAtendido);
        System.out.println(filaBanco);

        clienteAserAtendido = filaBanco.poll();
        System.out.println(clienteAserAtendido);
        System.out.println(filaBanco);

        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

        String primeiroClienteouErro = filaBanco.element();
        System.out.println(primeiroClienteouErro);
        System.out.println(filaBanco);

        for (String cliente: filaBanco){
            System.out.println(cliente);
        }

        Iterator<String> iteratorFila = filaBanco.iterator();
        while (iteratorFila.hasNext()){
            System.out.println("->" + iteratorFila.next());
        }

        System.out.println(filaBanco.size());


        System.out.println(filaBanco.isEmpty());





    }
}
