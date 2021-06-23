import java.io.IOException;
import java.util.List;

public interface IPyramidCSVDAO
{
    public List<Pyramid> readPyramidsFromCSV() throws IOException;
    public Pyramid createPyramid(String[] metadata);
    public void sortByHeight();
}
