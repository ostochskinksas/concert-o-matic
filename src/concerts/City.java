package concerts;

public class City {
    private String name;
    private String country;

    public City(String name, String country) {
        this.name    = name;
        this.country = country;
    }

    public String name() {
        return name;
    }

    public String country() {
        return country;
    }
}
