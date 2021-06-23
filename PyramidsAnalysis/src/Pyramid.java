public class Pyramid
{
    private String pharaoh;
    private String modernName;
    private String site;
    private double height;

    private Pyramid() {}
    public Pyramid(String Pharaoh, String Modern_name, String site, double height)
    {
        this.pharaoh=Pharaoh;
        this.modernName=Modern_name;
        this.site=site;
        this.height=height;
    }

    public String getPharaoh() { return pharaoh; }
    public void setPharaoh(String val) { pharaoh = val; }

    public String getModern_name() { return modernName; }
    public void setModern_name(String val) { modernName = val; }

    public String getSite() { return site; }
    public void setSite(String val) { this.site = val; }

    public double getHeight() { return height; }
    public void setHeight(double val) { this.height = val; }

    @Override
    public String toString() {
        return "[Pharoah: " + this.pharaoh +
                ", Modern-Name: " + this.modernName +
                ", Site: " + this.site +
                ", Height: " + this.height + "]";
    }
}
