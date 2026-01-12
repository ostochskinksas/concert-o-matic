package concerts;

public class Show{
    private Band band;
    private String tour;
    private String role;

    public Show(Band band, String tour, String role) {
        this.band = band;
        this.tour = tour;
        this.role = role;
    }

    public Band band() {
        return band;
    }

    public String tour() {
        return tour;
    }

    public String role() {
        return role;
    }
}
