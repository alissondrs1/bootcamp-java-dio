package ColletionseStreams.Map;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
/**  */
public class ExemploHashMap {
    public static void main(String[] args) {
        Map<String, Integer> campeoesMundialFifa = new HashMap<>();

        campeoesMundialFifa.put("Brasil", 5);
        campeoesMundialFifa.put("Alemanha", 4);
        campeoesMundialFifa.put("Italia", 145);
        campeoesMundialFifa.put("Uruguai", 2);
        campeoesMundialFifa.put("Argentina", 2);
        campeoesMundialFifa.put("França", 2);
        campeoesMundialFifa.put("Inglaterra", 1);
        campeoesMundialFifa.put("Espanha", 1);



        System.out.println(campeoesMundialFifa);

        campeoesMundialFifa.get(1);

        //Atualiza a chave Brasil
        campeoesMundialFifa.put("Brasil", 6);
        System.out.println(campeoesMundialFifa);


        //Retorna a chave da Argentina
        System.out.println(campeoesMundialFifa.get("Brasil"));

        //Retorna se exixte ou não um campeão França
        System.out.println(campeoesMundialFifa.containsKey("França"));

        //Remove o campeão França
        campeoesMundialFifa.remove("França");

        System.out.println(campeoesMundialFifa.containsValue(14));

        //Navega nos registros do mapa. Entry: getKey e getValue
        for (Map.Entry<String, Integer> entry : campeoesMundialFifa.entrySet()){
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }
        System.out.println("\n\n");

        //Navega nos registro de mapa. SOmente pela chave
        for (String key : campeoesMundialFifa.keySet()){
            System.out.println(key + "--" + campeoesMundialFifa.get(key));
        }
        System.out.println(campeoesMundialFifa);

        }
    }


