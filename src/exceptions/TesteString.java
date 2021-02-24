package exceptions;

public class TesteString {
    private static void aumentarLetras() throws Exception //lançando excessão na Assinatura do metodo
    {
        String frase = null ;
        String novaFrase = "alisson oi";
        try {
            novaFrase = frase.toUpperCase();
        }
        catch (NullPointerException e){
            throw new Exception(e);
        }
        novaFrase = frase.toUpperCase();
        System.out.println("Frase antiga: "+frase);
        System.out.println("Frase nova: "+novaFrase);
    }

    public static void main(String args[])
    {
        try
        {
            aumentarLetras();
        }
        catch(Exception e)
        {
            System.out.println("Ocorreu uma excesão ao executar o método aumentarLetras() "+e);
        }
    }
}

