import java.util.regex.*;
class regexam5
{
    public static void main(String argc[]) 
    {
        
    
    System.out.println("meta characters d...");
    System.out.println(Pattern.matches("\\d","abc"));
    System.out.println(Pattern.matches("\\d","1"));
    System.out.println(Pattern.matches("\\d","4567"));
    System.out.println(Pattern.matches("\\d","33abc"));
   
    System.out.println("meta character D....");
    System.out.println(Pattern.matches("\\D","abc"));
    System.out.println(Pattern.matches("\\D","1"));
    System.out.println(Pattern.matches("\\D","4567"));
    System.out.println(Pattern.matches("\\D","33abc"));
   
    System.out.println("meta character....");
    System.out.println(Pattern.matches("\\D*","ma$k"));


    } 
}
/*meta characters d...
false
true
false
false
meta character D....
false
false
false
false
meta character....
true */