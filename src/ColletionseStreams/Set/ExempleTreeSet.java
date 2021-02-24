package ColletionseStreams.Set;

import java.util.TreeSet;

public class ExempleTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeCapitals = new TreeSet<>();

        treeCapitals.add("Brasilia");
        treeCapitals.add("Florianopolis");
        treeCapitals.add("Curitiba");
        treeCapitals.add("São Paulo");
        treeCapitals.add("Rio de janeiro");

        System.out.println(treeCapitals.first());
        System.out.println(treeCapitals + "\n");

        System.out.println(treeCapitals.last()+"\n");
        System.out.println(treeCapitals.lower("Florianopolis\n"));
        System.out.println(treeCapitals.higher("Florianopolis"));

        System.out.println(treeCapitals);

        System.out.println("\n"+treeCapitals.pollFirst());
        System.out.println(treeCapitals+"\n");

        System.out.println(treeCapitals.pollLast());
        System.out.println(treeCapitals);

        System.out.println(treeCapitals.size());

        System.out.println(treeCapitals.isEmpty());

        treeCapitals.clear();
        System.out.println(treeCapitals);
    }



}

