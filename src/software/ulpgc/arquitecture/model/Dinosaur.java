package software.ulpgc.arquitecture.model;

public class Dinosaur {
    private final String name;
    private final String diet;
    private final String period;
    private final String length;

    public Dinosaur(String name, String diet, String period, String length) {
        this.name = name;
        this.diet = diet;
        this.period = period;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public String getDiet() {
        return diet;
    }

    public String getPeriod() {
        return period;
    }

    public String getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Dinosaur{" +
                "name='" + name + '\'' +
                ", diet='" + diet + '\'' +
                ", period='" + period + '\'' +
                ", length='" + length + '\'' +
                '}';
    }
}
