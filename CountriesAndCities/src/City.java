public class City
{
    private int cityNumber;
    private String cityName;
    private int cityPopulation;
    private String cityCode;

    public City (int cityNum, String cityName, int cityPobulation, String cityCode)
    {
        this.cityNumber = cityNum;
        this.cityName = cityName;
        this.cityPopulation = cityPobulation;
        this.cityCode = cityCode;
    }

    public int getCityNumber() {
       return cityNumber;
    }
    public String getCityName() {
       return cityName;
    }
    public int getCityPopulation() {
       return cityPopulation;
    }
    public String getCityCode() {
       return cityCode;
    }

    @Override
    public String toString()
    {
        return "City [" + cityName + ", population:" + cityPopulation + " " + cityCode + "]";
    }
}