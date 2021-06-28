public class IsLetter
{
    public static boolean isLetter(String string)
    {
        return string != null && !string.equals("") && string.chars().allMatch(Character::isLetter);
    }
}
