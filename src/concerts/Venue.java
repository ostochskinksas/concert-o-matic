package concerts;

public class Venue {
    private String name;
    private City city;

    public Venue(String name, City city) {
        this.name = name;
        this.city = city;
    }

    public String name() {
        return name;
    }

    public City city() {
        return city;
    }
}
