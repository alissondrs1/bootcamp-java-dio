package exceptions;

public class AumentaFrase {
    public static void main(String args[])
    {
        String frase = null;
        String novaFrase = null;
        try
        {
            novaFrase = frase.toUpperCase();
        }
        catch (NullPointerException e ) // Captura da possivél execeção.
        {
            //tratamento da exceção
            System.out.println("A frase inicial está nula," +
                    " para solucionar o problema, foi lhe atribido um valor default.");
            frase = "Frase vazia";
            novaFrase= frase.toUpperCase();
        }
        finally {
            System.out.println("Finalizando o processo");
        }

        System.out.println("Frase antiga: " + frase);
        System.out.println("Frase nova: " + novaFrase);
        }

}
