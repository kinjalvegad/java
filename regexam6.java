import java.util.regex.*;
class regexam6
{
    public static void main(String argc[]) 
    {
        
    
    
    System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","arun23"));
    System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","AAvar87"));
    System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","Ja0"));
    System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","aruJK5"));
    System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","arun$z"));
    System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","arun2"));
    


    } 
}
/*true
false
false
true
false
false */