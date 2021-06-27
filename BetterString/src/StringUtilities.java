public class StringUtilities
{
    public static void betterString(String str1, String str2, IsBetter<String> predicate)
    {
        if(predicate.isBetter(str1, str2))
            System.out.println("A is better than B");
        else
            System.out.println("B is better than A");
    }
}
