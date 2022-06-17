package learn;

import java.util.*;

public class StartCode {
    public static void main(String[] args) {
        System.out.println("welcome to code java collection");

        //creating collection

        //1  type safe - same type of elements are added  to collection
        
        //2 un type safe - different types of elements can be added to colletion

        //type safe collection
        ArrayList<String> names = new ArrayList<>();

        names.add("mahesh");
        names.add("tushar");
        names.add("ram");
        System.out.println(names.get(1));

  /*       //un type safe
        LinkedList list = new LinkedList();
        list.add("tushar");
        list.add(100);
        list.add(true);
        System.out.println(list);
*/
        names.remove("tushar");
        System.out.println(names);
        //size
        System.out.println(names.size());
        //cheack item  
        System.err.println(names.contains("ram"));

        //cheak empty
        System.err.println(names.isEmpty());

        Vector<String> vector = new Vector<>();
        
        
    }


    

}