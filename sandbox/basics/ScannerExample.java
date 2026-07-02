import java.util.Scanner;
import java.util.regex.MatchResult;

public class ScannerExample {
    public static void main(String[] args) {
        String wordsAndNumber = """
                Longing rusted furnace
                daybreak 17 benign
                9 homeoming 1
                freight car
                """;
        try (Scanner scanner = new Scanner(wordsAndNumber)) {
            scanner.findAll("benign").map(MatchResult::group).forEach(IO::println);
        }
    }
}