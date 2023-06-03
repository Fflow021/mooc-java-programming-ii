
public class LiteracyStatistics implements Comparable<LiteracyStatistics>{
    private String gender, country;
    private int year;
    private double litPercent;

    public LiteracyStatistics(String gender, String country, double litPercent, int year) {
        this.gender = gender;
        this.country = country;
        this.litPercent = litPercent;
        this.year = year;
    }

    public double getLitPercent() {
        return litPercent;
    }
    
    @Override
    public int compareTo(LiteracyStatistics comparedStatistics) {
        if (comparedStatistics.litPercent > this.litPercent) {
            return -1;
        } else if (comparedStatistics.litPercent < this.litPercent) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.gender + ", " + this.litPercent;
    }  
}
