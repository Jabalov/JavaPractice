public class OfficeHours
{
    private String date;
    private String from;
    private String to;

    public String getDate() { return date; }
    public void setDate(String val) { date = val ;}

    public String getFrom() { return from; }
    public void setFrom(String val) { from = val ;}

    public String getTo() { return date; }
    public void setTo(String val) { date = val ;}

    private OfficeHours() {}
    public OfficeHours(String date, String from, String to)
    {
        this.date = date;
        this.from = from;
        this.to = to;
    }
}
