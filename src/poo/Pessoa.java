package poo;

public class Pessoa {

    private String nome;
    private String  profissao ;
    private String cpf;

    public String getCpf() {
        return "42586431812";
    }

    public long setCpf(long cpf) {
        return cpf;
    }

    public String getNome() {
        return "Alisson";
    }

    public String getProfissao() {
        return  "Dev";


    }

    public String falarMeuProprioNome(){
        return "Olá meu nome é "+getNome();
    }

    public String falarProfissao(){
        return "Sou " +getProfissao();
    }
    public String falarIdade(){
        return "Tenho 26 anos de idade";
    }
    public String oCpf(){
        return getCpf();
    }

}
