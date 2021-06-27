public class City
{
    private int id;
    private String name;
    private int population;
    private String countryCode;

    void setId(int val) { id  = val; }
    int getId() { return id; }

    public City(int id, String name, int population, String countryCode)
    {
        this.id = id;
        this.name = name;
        this.population = population;
        this.countryCode = countryCode;
    }

    void setName(String val) { name  = val; }
    String getName() { return name; }

    void setPopulation(int val) { population  = val; }
    int getPopulation() { return population; }

    void setCountryCode(String val) { countryCode  = val; }
    String getCountryCode() { return countryCode; }

    @Override
    public String toString()
    {
        return "City: [Id: " +  this.getId()
                + ", Name: " + this.getName()
                + ", Population: " + this.getPopulation()
                + ", Country-Code: " + this.getCountryCode() + "]";
    }
}
