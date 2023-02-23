import java.util.*;
class exception1
{
    public static void main(String argc[])
    {
        float a,b,c;
        Scanner sc = new Scanner(System.in);
        try
        {
            a=sc.nextFloat();
            b=sc.nextFloat();
            c=a/b;
            System.out.println("c="+c);

        }
        catch(Exception e)
        {
            System.out.println("error"+e);
        }
        System.out.println("end");
    }
}