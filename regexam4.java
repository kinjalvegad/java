import java.util.regex.*;
class regexam4 
{
    public static void main(String argc[]) {
        
    
    System.out.println("? quantifier....");
    System.out.println(Pattern.matches("[amn]?","a"));
    System.out.println(Pattern.matches("[amn]?","aaa"));
    System.out.println(Pattern.matches("[amn]?","aammmnn"));
    System.out.println(Pattern.matches("[amn]?","aazzta"));
    System.out.println(Pattern.matches("[amn]?","am"));
    System.out.println("+ quantifier...");
    System.out.println(Pattern.matches("[amn]+","a"));
    System.out.println(Pattern.matches("[amn]+","aaa"));
    System.out.println(Pattern.matches("[amn]+","aammnn"));
    System.out.println(Pattern.matches("[amn]+","aazzta"));
    System.out.println("* quantifier...");
    System.out.println(Pattern.matches("[amn]*","aammnn"));


    } 
}
/* ? quantifier....
true
false
false
false
false
+ quantifier...
true
true
true
false
* quantifier...
true*/