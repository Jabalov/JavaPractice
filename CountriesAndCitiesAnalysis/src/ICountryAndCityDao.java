import java.io.IOException;
import java.util.List;

public interface ICountryAndCityDao
{
    List<Country> readCountry() throws IOException;
    List<City> readCity() throws IOException;
    Country createCountry(String[] metadata);
    City createCity(String[] metadata);
}

