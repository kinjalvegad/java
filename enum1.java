class enum1
{
    public enum season{ winter,spring,summer,fall}
    public static void main(String argc[])
    {
        for (season s:season.values())
        System.out.println(s);    
    }
}
/* winter
 * spring
 * summer
 * fall
 */