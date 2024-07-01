package BasicJavaPrograms;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        // List example
        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        displayCollection("List Example:", myList);

        // Set example
        Set<Integer> mySet = new HashSet<>();
        mySet.add(10);
        mySet.add(20);
        mySet.add(30);
        displayCollection("Set Example:", mySet);

       
    }

    private static void displayCollection(String title, Collection<?> collection) {
        System.out.println(title);
        for (Object item : collection) {
            System.out.println(item);
        }
    }
}