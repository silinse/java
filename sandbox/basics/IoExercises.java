import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class IoExercises {
    public static void main(String[] args) {
        try {
            System.out.println(countLines(Path.of("names.txt")));
        } catch(IOException e) {
            System.out.println("Could not read file: " + e.getMessage());
        }
    }

    // read file and count lines
    static int countLines(Path path) throws IOException {
        int count = 0;
        try(BufferedReader reader = Files.newBufferedReader(path)) {
            while(reader.readLine() != null) {
                count++;
            }
        }

        return count;
    }
}