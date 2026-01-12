package concerts;

public class Concert {
    private Date date;
    private int nbrOfBands;
    private Show[] shows;
    private Venue venue;
    private String tour;

    // private int price;


    public Concert(Date date, Show[] bands, Venue venue) {
        this.date  = date;
        this.shows = bands;
        this.venue = venue;

        nbrOfBands = bands.length;
        tour = bands[nbrOfBands - 1].tour();
    }



    public Date date() {
        return date;
    }

    public Show[] shows() {
        return shows;
    }

    public Venue venue() {
        return venue;
    }

    public String tour() {
        return tour;
    }

    @Override
    public String toString() {
        int i = 0;
        //       |              Band              |         Date        |     Tour     |           Role          |      Order      |        Venue         |            City             |             Country            |              Genre              |         Country of Origin         |
        return " | " + shows[i].band().name() + " | " + date.date() + " | " + tour + " | " + shows[i].role() + " | " + (i + 1) + " | " + venue.name() + " | " + venue.city().name() + " | " + venue.city().country() + " | " + shows[i].band().genre() + " | " + shows[i].band().country() + " | "; 
    }

}
