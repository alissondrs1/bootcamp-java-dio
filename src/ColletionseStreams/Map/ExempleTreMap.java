package ColletionseStreams.Map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExempleTreMap {
    public static void main(String[] args) {
        TreeMap<String, String> treeCapitals = new TreeMap<>();

        treeCapitals.put("RS", "Porto Alagre");
        treeCapitals.put("SC", "Florianopolis");
        treeCapitals.put("PR", "Curitiba");
        treeCapitals.put("SP", "São Paulo");
        treeCapitals.put("RJ", "Rio de Janeiro");
        treeCapitals.put("BH", "Belo Horizonte");

        System.out.println(treeCapitals);

        treeCapitals.put("AM ", "londres");
        System.out.println(treeCapitals);


        System.out.println(treeCapitals.firstKey());

        System.out.println(treeCapitals.lastKey());
        //abaixo de floriannopolis
        System.out.println(treeCapitals.lowerKey("SC"));
        //acima de florianopolis
        System.out.println(treeCapitals.higherKey("SC"));

        System.out.println("\n\n");
        //primeiro valor a entrar na arvore
        System.out.println(treeCapitals.firstEntry());
        //Ultimo valor da arvore
        System.out.println(treeCapitals.lastEntry());

        System.out.println(treeCapitals.lowerEntry( "SC"));

        System.out.println(treeCapitals.higherEntry("SC"));

        System.out.println(treeCapitals);

        //Retorna os prmeiro chave e valor da arvore
        System.out.println(treeCapitals.firstEntry().getKey() +"-"+ treeCapitals.firstEntry().getValue());
        //Retorna o ultimo chave e valor da arvore
        System.out.println(treeCapitals.lastEntry().getKey() +"-"+ treeCapitals.lastEntry().getValue());
        //retorna chave e valor abaixo de SC (parametro)
        System.out.println(treeCapitals.lowerEntry("SC").getKey() +"-"+ treeCapitals.lowerEntry("SC").getValue());
        //retorna chave e valor acima de SC (paremetro)
        System.out.println(treeCapitals.higherEntry("SC").getKey() +"-"+ treeCapitals.higherEntry("SC").getValue());

        Map.Entry<String, String> firstEntry = treeCapitals.pollFirstEntry();
        Map.Entry<String, String> lastEntry = treeCapitals.pollLastEntry();

        System.out.println(treeCapitals.firstEntry().getKey() +"-"+ treeCapitals.firstEntry().getValue());
        System.out.println(treeCapitals.lastEntry().getKey() +"-"+ treeCapitals.lastEntry().getValue());

        System.out.println(treeCapitals);

        System.out.println(treeCapitals.size());

        Iterator<String> iterator = treeCapitals.keySet().iterator();

        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + "-" + treeCapitals.get(key));
        }

        for (String capital : treeCapitals.keySet()){
            System.out.println(capital +"-"+ treeCapitals.get(capital));
        }
        System.out.println("\n\n\n");
        for (Map.Entry<String, String> capital: treeCapitals.entrySet()){
            System.out.println(capital.getKey() +"-"+ capital.getValue());

        }
       }

    }

