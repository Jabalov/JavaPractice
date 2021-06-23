import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class PyramidCSVDAO implements IPyramidCSVDAO
{
    List<Pyramid> dataset = new ArrayList<Pyramid>();
    private String path;
    private String header = "";
    public PyramidCSVDAO(String val) {path = val;}

    public String getHeader() { return header; }

    private double getAvgOfHeight()
    {
        double avg = 0;
        for(Pyramid pyramid : dataset)
            avg += pyramid.getHeight();
        avg /= dataset.size();

        return avg;
    }

    private class HeightComparator implements Comparator<Pyramid>
    {
        @Override
        public int compare(Pyramid o1, Pyramid o2) {
            return Double.compare(o1.getHeight(), o2.getHeight());
        }
    }

    @Override
    public List<Pyramid> readPyramidsFromCSV() throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String[] metadata;
        String line = "";
        header = reader.readLine();

        while (line != null)
        {
            line = reader.readLine();
            if (line!=null)
            {
                metadata = line.split(",");
                Pyramid newPyramid = createPyramid(metadata);
                dataset.add(newPyramid);
            }
        }
        return dataset;
    }

    @Override
    public Pyramid createPyramid(String[] metadata)
    {
        int avg = (int)getAvgOfHeight();
        String pharoah = metadata[0];
        String modernName = metadata[2];
        String site = metadata[4];
        double height = metadata[7].length() > 0 && !metadata[7].equals(null) ?
                Double.parseDouble(metadata[7]) : avg;

        return new Pyramid(pharoah, modernName, site, height);
    }

    @Override
    public void sortByHeight() { Collections.sort(dataset, new HeightComparator()); }

}
