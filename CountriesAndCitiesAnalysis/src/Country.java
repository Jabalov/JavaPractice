public class Country
{
    private String code;
    private String name;
    private String continent;
    private double surfaceArea;
    private double population;
    private double gnp;
    private int capital;

    public String getCode() { return code; }

    public Country(String code, String name, String continent, double surfaceArea, double population, double gnp, int capital)
    {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.surfaceArea = surfaceArea;
        this.population = population;
        this.gnp = gnp;
        this.capital = capital;
    }

    public String getContinent() { return continent; }

    public void setContinent(String continent) { this.continent = continent; }

    public double getSurfaceArea() { return surfaceArea; }

    public void setSurfaceArea(double surfaceArea) { this.surfaceArea = surfaceArea; }

    public double getGnp() { return gnp; }

    public void setGnp(double gnp) { this.gnp = gnp; }

    public int getCapital() { return capital; }

    public void setCapital(int capital) { this.capital = capital; }

    public void setCode(String code) { this.code = code; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public double getPopulation() { return population; }

    public void setPopulation(double population) { this.population = population; }

    @Override
    public String toString()
    {
        return "Country: [Code: " +  this.getCode()
                + ", Name: " + this.getName()
                + ", Population: " + this.getPopulation()
                + ", Continent: " + this.getContinent()
                + ", Surface-Area: " + this.getSurfaceArea()
                + ", GNP: " + this.getGnp()
                + ", Capital: " + this.getCapital() + "]";
    }
}
