package concerts;

public class Date {
    private String date;
    
    private String year;
    private String month;
    private String day;

    private String monthName;
    

    public Date(String date) {
        this.date = date;
        
        String[] dateParts = date.split("-");
        year  = dateParts[0];
        month = dateParts[1];
        day   = dateParts[2];

        monthName = switch (month) {
            case "01" -> "January";
            case "02" -> "February";
            case "03" -> "March";
            case "04" -> "April";
            case "05" -> "May";
            case "06" -> "June";
            case "07" -> "July";
            case "08" -> "August";
            case "09" -> "September";
            case "10" -> "October";
            case "11" -> "November";
            case "12" -> "December";
            default   -> "Error";
        };
    }

    public String date() {
        return date;
    }

    public String year() {
        return year;
    }

    public String month() {
        return month;
    }

    public String day () {
        return day;
    }

    public String monthName() {
        return monthName;
    }
}
