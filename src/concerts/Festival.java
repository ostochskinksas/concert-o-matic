package concerts;

public class Festival {
    private int nbrOfDays;
    private Date startDate;
    private Date endDate;
    private Concert[] festivalDays;

    //private int price;


    public Festival(int nbrOfDays, Date startDate, Date endDate, Concert[] festivalDays) {
        this.nbrOfDays    = nbrOfDays;
        this.startDate    = startDate;
        this.endDate      = endDate;
        this.festivalDays = festivalDays;
    }

    public int nbrOfDays() {
        return nbrOfDays;
    }

    public Date startDate() {
        return startDate;
    }

    public Date endDate() {
        return endDate;
    }
    
}
