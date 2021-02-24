package ColletionseStreams.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import java.util.stream.Collectors;

public class ExemploStreamAPI {
    public static void main(String[] args) {
        List<String> estudantes = new ArrayList<>();

        estudantes.add("Pedrow");
        estudantes.add("Taysew");
        estudantes.add("Marcwelo");
        estudantes.add("Tiagow");
        estudantes.add("Alissonw");
        estudantes.add("Joãow");

        //Retorna a contagem de elementos do stream
        System.out.println("Contagem: " + estudantes.stream().count());

        //Retorna o elemento com maior numero de letras
        System.out.println("Maior numero de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

        //Retorna o elemento com menor nuemero de letras
        System.out.println("Menor numero de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        //Retorna os elemento que tem a letra R no nome
        System.out.println("Com aletra r no nome: " + estudantes.stream().filter((estudante) ->
                estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        //Retorna uma nova coleção, com os nomes concatenados a quantidade de letra de cada nome
        System.out.println("Retorna uma n9ova coleção com a qnt de letras" + estudantes.stream().map(estudante ->
                estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        //Retorna somente os 3 primeiros elementos da coleção
        System.out.println("Retorna os 3 primeiros elementos" + estudantes.stream().limit(3).collect(Collectors.toList()));

        //Exibe cada elemento no console e depois retorna a mesma coleção
        System.out.println("Retorna os elementos " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        //Exibe cada elemtento no console, sem retornar outra coleção
        System.out.println("Retorna os elementos novamente: ");
        estudantes.stream().forEach(System.out::println);

        //Retorna true se todos os elementos possuem a letra w no nome
        System.out.println("Tosdos os elementos tem a letra W no nome?" + estudantes.stream().allMatch((elemento) -> elemento.contains("w" )));

        //Retorna true se tiver elemento possuem a letra a minuscula no nome
        System.out.println("Tem algum eelemento com a minuscula 'a' minusculo no nome?" + estudantes.stream().anyMatch((elemento) -> elemento.contains("a" )));

        //Retorna true se nenhum elemento possuem a letra a minuscula no nome
        System.out.println("Tem algum eelemento com a minuscula 'a' minusculo no nome?" + estudantes.stream().noneMatch((elemento) -> elemento.contains("a" )));

        //Retorna o primeiro elemento da coleção, se existir exibe no console
        System.out.println("Retorna o primeiro elemento da coleção: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        //Exemplo de opereção encadeada
        System.out.println("Operações encadeadas: ");
        System.out.println(estudantes.stream()  .peek(System.out::println).map(estudante ->
                estudante.concat(" - ").concat(String.valueOf(estudante.length()))).peek(System.out::println).filter((estudante)->
        estudante.toLowerCase().contains("r")).collect(Collectors.joining(", ")));
    }
}
