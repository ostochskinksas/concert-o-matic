package concerts.location;

public class City {
    private String name;
    private Country country;

    public City(String name, Country country) {
        this.name    = name;
        this.country = country;
    }

    public String name() {
        return name;
    }

    public Country country() {
        return country;
    }
}
