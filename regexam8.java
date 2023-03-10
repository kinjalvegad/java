import java.util.regex.*;
import java.util.*;
public class regexam8 
{
    public static void main(String argc[])
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter regex pattern");
            Pattern pattern=Pattern.compile(sc.nextLine());
            System.out.println("Enter text");
            Matcher matcher=pattern.matcher(sc.nextLine());
            boolean found=false;
            while(matcher.find())
            {
                System.out.println("i found the text"+ matcher.group()+"starting at index"+"and ending at index"+matcher.end());
                found=true;
            }
            if(!found)
            {
                System.out.println("no match found");
                break;
            }
        }
    }    
}
