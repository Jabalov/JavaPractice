public class Main
{
    public static void main(String[] args)
    {
        String str1 = "Muhammed", str2 = "Ahmed";

        StringUtilities.betterString(str1, str2, (s1, s2) -> s1.length() > s2.length());
        StringUtilities.betterString(str1, str2, (s1, s2) -> false);
    }
}
