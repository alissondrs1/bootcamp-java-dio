package ColletionseStreams;

import java.util.List;
import java.util.Vector;

public class ExempleVector {
    public static void main(String[] args) {


        List<String> esportes = new Vector<>();

        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tênis de mesa");
        esportes.add("Vôoleibol");

        System.out.println(esportes);

        //Add 4 eportes
        esportes.set(2, "Ping Pong");

        //Remove p espote da posição 2
        esportes.remove(2);

        //Remove o esporte Tênis de mesa
        esportes.remove("Tênis de mesa");

        //Retorna o primeiro item do vetor
        System.out.println(esportes.get(0));

        //navega na lista
         for (String esporte: esportes){
             System.out.println("->"+esporte);
         }
    }
}
