import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        CountryDAO.readCountriesCSV("dataset/Countries.csv");
        CityDao.readCitiesCSV("dataset/Cities.csv");

        System.out.println("\nA List Of Countries Population: ");
        CountryDAO.getCountriesPopulation();

        System.out.println("\nAverage Population per Countries: " + CountryDAO.getAveragePopulation());
        System.out.println("\nMax Country Population: " + CountryDAO.getMaxCountryPopulation());

        MappingClass.mappingCountry(CityDao.getCityDataset() ,CountryDAO.getCountryDataset());
        System.out.println("\nHighest Population City per Country: ");
        MappingClass.getHighestPopulationCityOfEachCountry();

        System.out.println("\nHighest Population Capital");
        MappingClass.getHighestPopulationCapital(CityDao.getCityDataset() ,CountryDAO.getCountryDataset());

        System.out.println("\nEnter a Country Code: \nSorted City for The Given Key:");
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();
        MappingClass.getCitiesPopulationSortedForAGivenCode(code);

    }

}