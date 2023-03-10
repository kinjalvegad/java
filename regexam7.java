import java.util.regex.*;
class regexam7
{
    public static void main(String argc[]) 
    {
        
    
    System.out.println("by char classes and  quantifiers");
    System.out.println(Pattern.matches("[789]{1}[0-9]{9}","9898989898"));
    System.out.println(Pattern.matches("[789][0-9]{9}","9953099530"));
    System.out.println(Pattern.matches("[789][0-9]{9}","99530995309"));
    System.out.println(Pattern.matches("[789][0-9]{9}","6953099530"));
    System.out.println(Pattern.matches("[789][0-9]{9}","8953089530"));
    System.out.println("by meta charaters...");
    System.out.println(Pattern.matches("[789]{1}\\d{9}","23456789"));
    System.out.println(Pattern.matches("[789]{1}\\d{9}","8888888888"));
    
    


    } 
}
/* by char classes and  quantifiers
true
true
false
false
true
by meta charaters...
false
true*/