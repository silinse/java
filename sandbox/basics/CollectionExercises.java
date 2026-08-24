import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionExercises {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4, 17, 2, 31, 8);
        System.out.println(findMax(numbers));

        List<Integer> testSumEven = List.of(3, 8, 11, 4, 7, 10);
        System.out.println(sumEven(testSumEven));

        List<Integer> testFilterGreaterThan = List.of(4, 17, 2, 31, 8, 25);
        System.out.println(filterGreaterThan(testFilterGreaterThan, 10));

        List<String> words = List.of("java", "python", "java", "csharp", "java", "python");
        System.out.println(countWords(words));
    }

    static int findMax(List<Integer> numbers) {
        int maximum = numbers.getFirst();
        for(int number : numbers) {
            if(number > maximum) {
                maximum = number;
            }
        }
        return maximum;
    }

    static int sumEven(List<Integer> numbers) {
        int sum = 0;
        for(int number : numbers) {
            if(number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }

    static List<Integer> filterGreaterThan (List<Integer> numbers, int minimum) {
        List<Integer> filteredNumbers = new ArrayList<>();
        for(int number : numbers) {
            if(number > minimum) {
                filteredNumbers.add(number);
            }
        }
        return filteredNumbers;
    }

    static Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> wordCount = new HashMap<>();
        for(String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        return wordCount;
    }
}