
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        List<LiteracyStatistics> litStats = new ArrayList<>();
        
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(piece -> piece.split(","))
                    .sorted((c1, c2) -> c1[5].compareTo(c2[5]))
                    .forEach(thing -> litStats.add(new LiteracyStatistics(thing[2].trim().split(" ")[0],
                            thing[3], Double.valueOf(thing[5]), Integer.valueOf(thing[4]))));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        litStats.stream().forEach(s -> System.out.println(s));
    }
}
