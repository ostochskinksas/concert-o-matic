package concerts;

public class Band {
    private String name;
    private String genre;
    private String country;

    public Band(String name, String genre, String country) {
        this.name    = name;
        this.genre   = genre;
        this.country = country;
    }

    public String name() {
        return name;
    }

    public String genre() {
        return genre;
    }

    public String country() {
        return country;
    }
}
