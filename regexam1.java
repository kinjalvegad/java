import java.util.regex.*;
public class regexam1
{
    public static void main(String argc[])
    {
       Pattern p=Pattern.compile(".s");
       Matcher m=p.matcher("as");
       boolean b=m.matches();
       // 2nd way
       boolean b2=Pattern.compile(".s").matcher("as").matches();
       //3rd way
       boolean b3=Pattern.matches(".s","as");
       System.out.println(b+" "+b2+""+b3);
    }
}
/* true truetrue*/