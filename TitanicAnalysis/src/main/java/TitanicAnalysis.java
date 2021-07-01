import org.knowm.xchart.*;
import org.knowm.xchart.style.Styler;
import tech.tablesaw.api.Row;
import tech.tablesaw.api.Table;

import java.awt.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TitanicAnalysis
{
    public static void main(String args[]) throws IOException
    {
        List<Passenger> passengersDataset = new ReadJsonFile().readPassengersJsonFile();

        GraphPassengers.graphPassengerAges(passengersDataset);
        GraphPassengers.graphPassengerClass(passengersDataset);
        GraphPassengers.graphPassengerSurvived(passengersDataset);
        GraphPassengers.graphPassengerNotSurvivedSex(passengersDataset);
    }

}
