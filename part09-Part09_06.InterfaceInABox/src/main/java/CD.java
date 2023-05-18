
public class CD implements Packable{
    private String artist, cdName;
    private int pubYear;
    
    public CD(String artist, String cdName, int pubYear) {
        this.artist = artist;
        this.cdName = cdName;
        this.pubYear = pubYear;
    }

    public double weight() {
        return 0.1;
    }
    
    @Override
    public String toString() {
        return this.artist + ": " + this.cdName + " (" + this.pubYear + ")";
    }
    
    
}
