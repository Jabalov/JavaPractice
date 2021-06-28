public class Main
{

    public static void main(String[] args)
    {
        String name = "Muhammed";
        String notAllLetter = "#$FGH@#$ss";

        System.out.println(IsLetter.isLetter(name));
        System.out.println(IsLetter.isLetter(notAllLetter));
    }
}
