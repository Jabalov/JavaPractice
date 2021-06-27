import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        CountryAndCityDao dao = new CountryAndCityDao("Data_sets\\Cities.csv",
                                                        "Data_sets\\Countries.csv");

        List<Country> countryDataset = dao.readCountry();
        List<City> cityDataset = dao.readCity();
        HashMap<String, List<City>> codeToCity = dao.MappingCodeToCities();

        System.out.println("Enter The Country-Code:");
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();
        System.out.println("Sorted Cities (By Name) for the Code: " + code);
        List<City> sortedCities = sortByPopulation(codeToCity, code);
        sortedCities.forEach(System.out::println);

        System.out.println();

        System.out.println("List of countries population");
        countryDataset.forEach(country -> System.out.println(country.getName() + " " + country.getPopulation()));

        System.out.println();

        System.out.println("the average countries population " + avgCountryPopulation(countryDataset));

        System.out.println("Maximum Country population is: " + maxCountryPopulation(countryDataset));
        
        System.out.println();
        System.out.println("Highest population city of each country");
        highestPopulationCityOfEachCountry(countryDataset, cityDataset);

        System.out.println();
        System.out.println("Highest population capital");
        highestPopulationCapital(countryDataset, cityDataset);
    }

    private static double avgCountryPopulation(List<Country> countryDataset)
    {
        return countryDataset.stream()
                .mapToDouble(Country::getPopulation)
                .average()
                .getAsDouble();
    }

    private static double maxCountryPopulation(List<Country> countryDataset)
    {
        return countryDataset.stream()
                .mapToDouble(Country::getPopulation)
                .max()
                .getAsDouble();
    }

    private static void highestPopulationCityOfEachCountry(List<Country> countryDataset, List<City> cityDataset)
    {
        for (Country country : countryDataset)
        {
            List<City> citiesThatHaveMaxPop = cityDataset.stream()
                                                        .filter(c -> c.getCountryCode().equals(country.getCode()))
                                                        .sorted(Comparator.comparing(City::getPopulation).reversed())
                                                        .limit(1)
                                                        .toList();

            citiesThatHaveMaxPop
                    .forEach(c -> System.out.println("City " + c.getName() + " " + c.getCountryCode() + " " + c.getPopulation()));
        }
    }

    private static void highestPopulationCapital(List<Country> countryDataset, List<City> cityDataset)
    {
        List<City> capitals = new ArrayList<>();
        for (Country country: countryDataset)
        {
            capitals = cityDataset.stream()
                        .filter(c -> country.getCapital() == c.getId())
                        .toList();
        }
        double maxPop = capitals.stream().mapToDouble(City::getPopulation).max().getAsDouble();
        System.out.println(capitals.stream().filter(c -> c.getPopulation() == maxPop).toList());
    }

    private static List<City> sortByPopulation(HashMap<String, List<City>> codeToCity, String code)
    {
        List<City> cities = codeToCity.get(code);
        return cities.stream()
                .sorted(Comparator.comparingDouble(City::getPopulation))    
                .collect(Collectors.toList());
    }

}
