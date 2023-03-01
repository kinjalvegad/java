class enum2
{
    public enum season{ winter,spring,summer,fall}
    public static void main(String argc[])
    {
        for (season s:season.values())
        {
            System.out.println(s);
        }
        System.out.println("value of winter is :" + season.valueOf ("winter"));    
        System.out.println("value of winter is :" + season.valueOf ("winter").ordinal());    
        System.out.println("value of summer is :" + season.valueOf ("summer").ordinal());    
    }
}


/*
 * winter
 * spring
 * summer
 * fall
 * value of winter is :winter
value of winter is :0
value of summer is :2
 */