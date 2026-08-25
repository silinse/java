import java.util.List;
import java.util.stream.Stream;

public class StreamExercises {
    public static void main(String[] args) {
        List<String> names = List.of(
                "John",
                "Bob",
                "Alice",
                "John",
                "Kate",
                "Alex",
                "Bob"
        );
        names.forEach(name -> {
            if(name.startsWith("A")) {
                System.out.println(name);
            }
        });

        Stream<String> stream = names.stream()
                .filter(name -> {
                    System.out.println("Checking " + name);
                    return name.startsWith("A");
                });

        System.out.println("Stream created");
        List<String> result = stream.toList();

        System.out.println(processNames(names));
    }

    static List<String>processNames(List<String> names) {
        return names.stream()
                .filter(name -> name.length() >= 4)
                .map(String::toUpperCase)
                .distinct()
                .sorted()
                .toList();
    }
}