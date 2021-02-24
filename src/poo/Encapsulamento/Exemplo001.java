package Encapsulamento;

public class Exemplo001 {
    public static void main(String[] args) {
        Pessoa eu= new Pessoa ("Alisson", 28,11,1994);

        System.out.println(eu.getNome());
        System.out.println(eu.getDataNascimento());
        System.out.println(eu.calculaIdade());


        eu.setNome("Alisson Daniel");

        System.out.println(eu.getNome());


    }
}
