import java.util.stream.IntStream;

public class IpCutter
{
    private final String line;
    private final int[] subs = { 0, 0, 0, 0 };

    public IpCutter(String line) { this.line = line; }
    public int[] process()
    {
        String[] components = line.split("\\.");
        if (components.length > 4)
            throw new IllegalArgumentException("Enter a valid Ip");

        IntStream.range(0, components.length).forEach(i -> subs[i] = Integer.parseInt(components[i]));
        return subs;
    }
    @Override
    public String toString() { return subs[0] + "\n" + subs[1] + "\n" + subs[2] + "\n" + subs[3]; }
}
