import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CountryDAO
{
    static List<Country> countries = new ArrayList<>();

    public static void readCountriesCSV(String path) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;
        String[] parts;
        Country country;
        do {
                line = reader.readLine();
                if (line != null)
                {
                    parts = line.split(",");
                    country = new Country(parts[0], parts[1].trim(),
                            parts[2], Integer.parseInt(parts[3]),
                            Double.parseDouble(parts[4]), Double.parseDouble(parts[5]),
                            Integer.parseInt(parts[6]));
                    countries.add(country);
                }
            } while (line != null);
        reader.close();
    }

    public static void getCountriesPopulation()
    {
        countries.forEach(c -> System.out.println(c.getCountryName() + " : "+ c.getPopulation()));
    }

    public static double getAveragePopulation()
    {
        return countries.stream().mapToLong(Country::getPopulation).average().getAsDouble();
    }

    public static long getMaxCountryPopulation()
    {
        return countries.stream().map(Country::getPopulation).max(Long::compare).get();
    }

    public static List<Country> getCountryDataset()
    {
        return countries;
    }
}
