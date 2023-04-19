
import java.util.HashMap;

public class Abbreviations {

    private HashMap<String, String> hashmap;

    public Abbreviations() {
        this.hashmap = new HashMap<>();

    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.hashmap.put(abbreviation, explanation);

    }
    //return the value
    public boolean hasAbbreviation(String abbreviation) {
        return this.hashmap.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        return this.hashmap.get(abbreviation);
    }
}
