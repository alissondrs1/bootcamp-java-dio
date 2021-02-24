package construtor.exemplo1;

public class ExemploInstaciaObjeto {
    public static void main (String[] args){

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Alisson");

        System.out.println(pessoa.getNome());
    }

}
