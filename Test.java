package Stramcollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer>list1= Arrays.asList(1,2,3,4);
        list1.stream().map(e->e*2 ).forEach(System.out::println);

     // collection
     for(Integer aa:list1){
         System.out.println(aa*2);

    //without map
         list1.stream().forEach(e-> System.out.println(e*2));








     }



    }
}

