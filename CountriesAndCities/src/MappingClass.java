import static java.util.Collections.max;
import static java.util.Collections.reverseOrder;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MappingClass
{
    private static HashMap<String, List<City>> countryMap = new HashMap<>();

    public static HashMap<String, List<City>> getCountryMap() { return countryMap; }

    public static void mappingCountry (List<City> cities, List<Country> countries)
    {
        countries.forEach(country -> {
            List<City> cityList = cities.stream()
                    .filter(c -> c.getCityCode().equals(country.getCode()))
                    .collect(Collectors.toList());

            countryMap.put(country.getCode().trim(), cityList);
        });
    }

    public static void getHighestPopulationCityOfEachCountry()
    {
        countryMap.forEach((code, value) -> countryMap.get(code).stream()
                .sorted(Comparator.comparing(City::getCityPopulation).reversed())
                .limit(1)
                .forEach(System.out::println));
    }

    public static void getHighestPopulationCapital(List<City> cities, List<Country> countries)
    {
        List<List<City>> capitals = countries.stream().map(country -> cities.stream()
                .filter(c -> country.getCapitalId() == c.getCityNumber())
                .collect(Collectors.toList())).collect(Collectors.toList());

        List<City> extractedCapitals = new ArrayList<>();
        capitals.forEach(capital -> {
            try {
                extractedCapitals.add(capital.get(0));
            } catch (Exception exception) { }
        });

        var maxPopulation = extractedCapitals.stream()
                .map(City::getCityPopulation)
                .sorted(reverseOrder())
                .limit(1)
                .toList()
                .get(0);

        System.out.println(extractedCapitals.stream().filter(c -> c.getCityPopulation() == maxPopulation).toList());
    }

    public static void getCitiesPopulationSortedForAGivenCode(String code)
    {
        List<City> cities = countryMap.get(code);
        cities.stream()
                .sorted(Comparator.comparingLong(City::getCityPopulation))
                .toList()
                .forEach(System.out::println);

    }
}

