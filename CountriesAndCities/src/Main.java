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

        System.out.println("\n A List Of Countries Population: ");
        CountryDAO.getCountriesPopulation();

        System.out.println("\n Average Population per Countries: " + CountryDAO.getAveragePopulation());
        System.out.println("\n Max Country Population: " + CountryDAO.getMaxCountryPopulation());

        MappingClass.mappingCountry(CityDao.getCityDataset() ,CountryDAO.getCountryDataset());
        System.out.println("\n Highest Population City per Country: ");
        MappingClass.getHighestPopulationCityOfEachCountry();

        System.out.println("\n Highest Population Capital");
        MappingClass.getHighestPopulationCapital(CityDao.getCityDataset() ,CountryDAO.getCountryDataset());

    }

}