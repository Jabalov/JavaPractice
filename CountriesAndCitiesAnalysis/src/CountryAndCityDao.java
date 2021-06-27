import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountryAndCityDao implements ICountryAndCityDao
{
    private final String CityPath;
    private final String CountryPath;

    List<Country> countryDataset = new ArrayList<>();
    List<City> cityDataset = new ArrayList<>();

    public CountryAndCityDao(String path1, String path2)
    {
        CityPath = path1;
        CountryPath = path2;
    }

    @Override
    public List<Country> readCountry() throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(CountryPath));
        String[] metadata;
        String line = "";

        while (line != null)
        {
            line = reader.readLine();
            if (line!=null)
            {
                metadata = line.split(",");
                Country country = createCountry(metadata);
                countryDataset.add(country);
            }
        }
        return countryDataset;
    }

    @Override
    public List<City> readCity() throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(CityPath));
        String[] metadata;
        String line = "";

        while (line != null)
        {
            line = reader.readLine();
            if (line != null)
            {
                metadata = line.split(",");
                City newCity = createCity(metadata);
                cityDataset.add(newCity);
            }
        }
        return cityDataset;
    }

    @Override
    public Country createCountry(String[] metadata)
    {
        String code = metadata[0].strip();
        String name = metadata[1].strip();
        String continent = metadata[2].strip();
        double surfaceArea = Double.parseDouble(metadata[3]);
        double population = Double.parseDouble(metadata[4]);
        double gnp = Double.parseDouble(metadata[5]);
        int capital = Integer.parseInt(metadata[6]);

        return new Country(code, name, continent, surfaceArea, population, gnp, capital);
    }

    @Override
    public City createCity(String[] metadata)
    {
         int id = Integer.parseInt(metadata[0]);
         String name = metadata[1].strip();
         int population = Integer.parseInt(metadata[2]);
         String countryCode = metadata[3].strip();

        return new City(id, name, population, countryCode);
    }

    public HashMap<String, List<City>> MappingCodeToCities()
    {
        HashMap<String, List<City>> CodeToCities = new HashMap<>();

        for(Country country : countryDataset)
        {
            List<City> cities = new ArrayList<>();
            for(City city: cityDataset)
            {
                if(country.getCode().equals(city.getCountryCode()))
                    cities.add(city);
            }
            CodeToCities.put(country.getCode(), cities);
        }

        return CodeToCities;
    }
}
