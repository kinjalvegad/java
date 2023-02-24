class exception2
{
    public static void main(String argc[])
    {
        int a,b,c;
        try
        {
            a=Integer.parseInt(argc[0]);
            b=Integer.parseInt(argc[1]);
            c=a/b;
            System.out.println("c="+c);
        }
        
        catch (NumberFormatException e)
        {
            System.out.println("type mismatch error");
        }
        finally
        {
            System.out.println("end");
        }
    }
}