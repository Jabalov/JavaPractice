import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an IP Address");
        String line = scanner.nextLine();
        IpCutter cutter = new IpCutter(line);

        try
        {
            int[] out = cutter.process();
        }
        catch (IllegalArgumentException exc)
        {
            System.out.println(exc.getMessage());
        }
        finally
        {
            System.out.println(cutter);
        }
    }
}
