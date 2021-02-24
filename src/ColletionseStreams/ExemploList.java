package ColletionseStreams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos"); //método .add adicioana um nome em nossa lista.
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("João");
        nomes.add("Maria");

        nomes.addAll(nomes);
        System.out.println(nomes);

        System.out.println(nomes);

        nomes.set(2,"Larissa");// Método .set atualiza a posição.

        System.out.println(nomes);

        Collections.sort(nomes); // método sort da biblioteca Collections ordena a lista em ordem alfabética.

        System.out.println(nomes);

        nomes.set(2,"Alisson");

        nomes.remove(2); // método .remove, remove a posição com a passagem do index(id) no parametro do método.

        System.out.println(nomes);

        nomes.add(2, "Maria");

        System.out.println(nomes);

        nomes.remove("Maria");// Aqui ultilizamos o método remove para remover através do proprio elento da lista
        nomes.remove("Maria");

        System.out.println(nomes);

        String nome = nomes.get(3);

        System.out.println(nome);

        int posicao = nomes.indexOf("Daniel"); // encontra a posição na lista e nos retorna a posição

        System.out.println("Carlos esta na posição "+posicao + " da lista.");

        int tamanho = nomes.size(); // nos retorna ao tamanho da lista
        System.out.println(tamanho);

        nomes.remove("Larissa");

        tamanho = nomes.size();
        System.out.println(tamanho);

        boolean temNome = nomes.contains("Alfredo");// procura pelo elemento na lista nos retornando um valor booleano "false" ou "true"
        System.out.println(temNome);

        boolean listaEstaVazia = nomes.isEmpty(); // Checa se a lista esta vazia, caso esteja "true" caso não "false".
        System.out.println(listaEstaVazia);

        for (String nomeDoItem: nomes){ // interação
            System.out.println("--->" + nomeDoItem);
        }

        Iterator<String > iterator = nomes.iterator();

        while (iterator.hasNext()){
            System.out.println("->" + iterator.next());
        }

        nomes.clear();// o método clear limpa a lista
        System.out.println(nomes);

        listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);

        nomes.addAll(nomes);
        System.out.println(nomes);
    }
}
