package Stramcollection;

import java.util.HashMap;
import java.util.Map;

public class test3 {
    public static void main(String[] args) {
        Map<Integer,String>map=new HashMap<>();
        map.put(1,"E");
        map.put(2,"A");
        map.put(3,"F");
        map.put(4,"G");
        map.put(5,"B");
        System.out.println(map.get(3));
       map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
       
        map.values().stream().sorted().forEach(System.out::println);

    }
}
