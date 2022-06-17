package learn;

import java.util.HashSet;
import java.util.TreeSet;

public class StartCode2 {
    public static void main(String[] args) {
        HashSet<Double> hashset = new HashSet<>();
        
        hashset.add(12.11);
        hashset.add(23.2522);
        hashset.add(45.224);
        hashset.add(65.33);
        
        System.out.println(hashset);

        TreeSet<Double> tree = new TreeSet<>();
        tree.addAll(hashset);

        System.out.println(tree);

    }
}
