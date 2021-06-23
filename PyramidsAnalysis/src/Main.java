import java.io.IOException;
import java.util.*;

public class Main
{

    public static void main(String[] args) throws IOException
    {

        var dao = new PyramidCSVDAO("pyramids.csv");
        List<Pyramid> dataset = dao.readPyramidsFromCSV();
        String header = dao.getHeader();
        dao.sortByHeight();

        display(dataset);

        var siteCount = mapWithSites(dataset);
        System.out.println(siteCount);
    }

    private static void display(List<Pyramid> dataset)
    {
        int i = 0;
        for (Pyramid pyramid : dataset)
            System.out.println("#" + i++ + pyramid);
    }

    public static Map<String, Integer> mapWithSites (List<Pyramid> pyramids)
    {
        Map<String, Integer> countBySite = new HashMap<>();

        for (Pyramid p: pyramids)
        {
            String site= p.getSite();
            Integer count = countBySite.get(site);

            if (count == null)
                count = 1;
            else
                count++;

            countBySite.put(site, count);
        }
        return countBySite;
    }
}