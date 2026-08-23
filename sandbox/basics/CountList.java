import java.util.*;

// Produce a map counting elements in a list
public class CountList {
    public static void main(String[] args) {
        List<String> names = List.of(
                "John",
                "Alice",
                "John",
                "Bob",
                "Alice",
                "John"
        );

        Map<String, Integer> count = new HashMap<>();

        for(String name : names){
            if(count.containsKey(name)){
                count.put(name, count.get(name) + 1);
            }else{
                count.put(name, 1);
            }
        }

        System.out.println(count);
    }
}