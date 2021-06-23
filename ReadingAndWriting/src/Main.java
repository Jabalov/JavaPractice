import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        ReadFromConsoleAndWriteInFile("C:\\Users\\Jabal\\Desktop\\ITI\\JAVA\\Practice\\test.txt");
    }

    private static void ReadFromConsoleAndWriteInFile(String path) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        String line ="";

        do
        {
            if(!line.equals(""))
            {
                System.out.println("Data enterd: " + line);
                writer.write(line);
                writer.write("\n");
            }
            System.out.println("Enter a line: ");

        }while (!(line = reader.readLine()).equals("stop"));

        reader.close();
        writer.close();
    }
}